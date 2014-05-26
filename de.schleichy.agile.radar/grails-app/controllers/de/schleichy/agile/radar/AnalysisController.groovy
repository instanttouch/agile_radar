package de.schleichy.agile.radar

class AnalysisController {

	def current(){
		Snapshot latestSnapshot = Snapshot.list()[0]		
		render(view: "current", model: [data : latestSnapshot])
	}

	def all(){
		def snapshots = Snapshot.list()
		render(view: "all", model: [snapshotList : snapshots, choosenAccount : "all"])
	}

	def account(){
		String name =  params["name"]
		Account account = Account.findByName(name)
		def snapshots = Snapshot.findAllByAccount(account)
		render(view: "all", model: [snapshotList : snapshots, choosenAccount : name])
	}
	
	
	def snapshot(){

		Snapshot useSnapshot = null

		String dateString = params["data"]
		if(dateString){
			final Date date = new Date().parse("dd.MM.yyyy",dateString);
			if(date){

				def founded = Snapshot.list().find{
					it.dateCreated >= date && it.dateCreated < date+1
				}
				if(founded){
					useSnapshot = founded
				}
			}
			render(view: "current", model: [data : useSnapshot])
		}
	}
}
