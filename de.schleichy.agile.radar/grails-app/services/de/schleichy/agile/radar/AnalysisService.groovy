package de.schleichy.agile.radar

import grails.transaction.Transactional

@Transactional
class AnalysisService {

	public static SpiderData calcLatest(){
		SpiderData spiderData = null

		Snapshot latestSnapshot = Snapshot.list()[0]
		if(latestSnapshot){
			spiderData = calculate(latestSnapshot)
		}

		return spiderData
	}

	public static SpiderData calculate(Snapshot useSnapshot) {

		SpiderData spiderData = new SpiderData()

		def categories = Category.list()
		//		categories.each {
		//			spiderData.addCategory(it.name)
		//		}

		spiderData.addCategory("Goal")
		spiderData.addCategory("Fun")
		spiderData.addCategory("Wrong")
		spiderData.addCategory("Impediments")
		spiderData.addCategory("Quality")


		useSnapshot.entries.each { Entry entry ->
			Element element = entry.element
			Impact value = entry.value

			Category category = element.category
			Double impact = value.value
			if(impact){

				if(!element.positive && category.positive || element.positive && !category.positive){
					impact = 10 - impact
				}

				double weight = element.weight
				for(int i=0;i<weight;i++){
					if(i>=10){
						break
					}

					spiderData.addValue(category.name, impact)
				}
			}
		}

		return spiderData
	}
	
	public static double calculateIndex(Snapshot useSnapshot){
		SpiderData spiderData = calculate(useSnapshot)
		
		def String[] categories = new String[5]
		categories[0] = "Goal"
		categories[1] = "Fun"
		categories[2] = "Wrong"
		categories[3] = "Impediments"
		categories[4] = "Quality"
   
		Double[] values = spiderData.data(categories)
		
		double index = values[0]
		index += values[1]
		index -= values[2]
		index -= values[3]
		index += values[4]
		
		return index
	}
}
