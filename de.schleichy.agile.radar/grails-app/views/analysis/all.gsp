<%@page import="de.schleichy.agile.radar.SpiderData"%>
<%@page import="de.schleichy.agile.radar.AnalysisService"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>Daten Eingabe</title>
<g:javascript library="jquery" />
<g:javascript library="spider" />

</head>
<body>
<g:each in="${snapshotList}" var="myData">
<style>
#spidergraphcontainer${myData.id} {
	width: 200px;
	height: 200px;
	margin-top: 50px;
	margin-left: 50px;
	position: relative;
}
</style>
</g:each>

	<div class="body">
		<div class="nav" role="novigation">
			<ul>
				<li><a class="home" href="${createLink(uri:'/')}"> <g:message
							code="default.home.label" />
				</a></li>
			</ul>
		</div>
	</div>
	<div id="select_snaphshot">
		<g:form controller="Analysis" action="account" id="data.id">
			<g:select id="account" name="name" optionValue="name" 
				from="${de.schleichy.agile.radar.Account.list()}" />
			<g:actionSubmit value="account" />
		</g:form>
	</div>
	
	
	<g:each in="${snapshotList}" var="myData">
		<div id="spidergraphcontainer${myData.id}"></div>
		<%double index = de.schleichy.agile.radar.AnalysisService.calculateIndex(myData) %>
		<h3>${myData.name} at ${myData.dateCreated.format("dd.MM.yyyy")}, AgileIndex: <g:formatNumber number="${index}" type="number"
                maxFractionDigits="2" roundingMode="HALF_DOWN" /></h3>
	</g:each>
 
	<script type="text/javascript">
	$(function() {

		<g:each in="${snapshotList}" var="myData">
		
	<% 
	
	 de.schleichy.agile.radar.SpiderData spiderResults = de.schleichy.agile.radar.AnalysisService.calculate(myData)
	 
	 def String dataString = ""
	 def String[] categories = new String[5]
	 categories[0] = "Goal"
	 categories[1] = "Fun"
	 categories[2] = "Wrong"
	 categories[3] = "Impediments"
	 categories[4] = "Quality"	
		 
	 Double[] values = spiderResults.data(categories)	 
	 dataString = "["
	 for(int i=0;i<values.length;i++){
		 if(i>0){
			 dataString+= ","
		 }
			 
	     Double value = values[i]
		 dataString += "${value}"
	 }
	 dataString += "]"
	 
	%>			

			$('#spidergraphcontainer${myData.id}').spidergraph({
				'fields' : [ "Goal", "Fun", "Wrong", "Impediments", "Quality" ],
				'gridcolor' : 'rgba(20,20,20,1)'
			});
			$('#spidergraphcontainer${myData.id}').spidergraph('addlayer', {
				'strokecolor' : 'rgba(230,104,0,0.8)',
				'fillcolor' : 'rgba(230,104,0,0.6)',
				'data' : <%=dataString%>
			});

	</g:each>
	});	
	</script>
	
</body>
</html>