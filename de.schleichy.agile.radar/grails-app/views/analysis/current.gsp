<%@page import="de.schleichy.agile.radar.Snapshot"%>
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
	<style>
#spidergraphcontainer {
	width: 400px;
	height: 400px;
	margin-top: 50px;
	margin-left: 50px;
	position: relative;
}
</style>
	<div class="body">
		<div class="nav" role="novigation">
			<ul>
				<li><a class="home" href="${createLink(uri:'/')}"> <g:message
							code="default.home.label" />
				</a></li>
			</ul>
		</div>
		<h1>Radarchart für Snapshot vom ${data.dateCreated.format("dd.MM.yyyy")}</h1>
	</div>
	<div id="select_snaphshot">
		<g:form controller="Analysis" action="snapshot" id="data.id">
			<g:select id="snapshot" name="data" optionValue="dateCreated" value="${data.dateCreated}"
				from="${Snapshot.list()}" />
			<g:actionSubmit value="snapshot" />
		</g:form>
	</div>
	<div id="spidergraphcontainer"></div>

	<script type="text/javascript">
		
	<% 
	
	 de.schleichy.agile.radar.SpiderData spiderResults = null
	
	 if(data){
		spiderResults = de.schleichy.agile.radar.AnalysisService.calculate(data)
	 } else {
	 	spiderResults = de.schleichy.agile.radar.AnalysisService.calcLatest()
	 }
	 
	 def String dataString = ""
	 
	 if(data){	 
		 String[] fields = spiderResults.fields()
		 
		 String fieldString = "["
		 for(int i=0;i<fields.length;i++){
			 if(i>0){
				 fieldString+= ","
			 }
			 
			 String category = fields[i]		 
			 fieldString += "'${category}'"
		 } 
		 fieldString += "]"
		 
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
	 }
	 
	%>
		$(function() {

			$('#spidergraphcontainer').spidergraph({
				'fields' : [ "Goal", "Fun", "Wrong", "Impediments", "Quality" ],
				'gridcolor' : 'rgba(20,20,20,1)'
			});
			$('#spidergraphcontainer').spidergraph('addlayer', {
				'strokecolor' : 'rgba(230,104,0,0.8)',
				'fillcolor' : 'rgba(230,104,0,0.6)',
				'data' : <%=dataString%>
			});

		});
	</script>

</body>
</html>