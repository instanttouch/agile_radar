import de.schleichy.agile.radar.Impact
import de.schleichy.agile.radar.Category
import de.schleichy.agile.radar.Element

class BootStrap {

	def init = { servletContext ->

		//categories
		try {
			def goal = new Category(name:'Goal',positive:true)
			def fun = new Category(name:'Fun',positive:true)
			def wrong = new Category(name:'Wrong',positive:false)
			def impediments = new Category(name:'Impediments',positive:false)
			def quality = new Category(name:'Quality',positive:true)

			goal.save(flush: true)
			fun.save(flush: true)
			wrong.save(flush: true)
			impediments.save(flush: true)
			quality.save(flush: true)

			//elements
			def element = new Element(name:'velocity',positive:true,weight:7.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'velocity',positive:true,weight:7.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'estimation',positive:true,weight:8.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'functionality',positive:true,weight:9.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'open for change',positive:true,weight:6.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'business value',positive:true,weight:8.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'big picture',positive:true,weight:9.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'product vision',positive:true,weight:10.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'clearness',positive:true,weight:7.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'meaningful stories',positive:true,weight:7.0)
			element.category = goal
			element.save(flush: true, insert: true)

			element = new Element(name:'focus',positive:true,weight:9.0)
			element.category = goal
			element.save(flush: true, insert: true)

			goal.save(flush:true)

			element = new Element(name:'pair programming',positive:true,weight:9.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'pair design',positive:true,weight:5.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'communication',positive:true,weight:10.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'openness',positive:true,weight:8.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'respect',positive:true,weight:8.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'collaboration ',positive:true,weight:10.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'flow',positive:true,weight:8.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'humanity',positive:true,weight:10.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'motivation',positive:true,weight:10.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'self organizing team',positive:true,weight:7.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'supportive culture',positive:true,weight:10.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'diversity',positive:true,weight:5.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'white board',positive:true,weight:5.0)
			element.category = fun
			element.save(flush: true, insert: true)

			element = new Element(name:'collective code ownership',positive:true,weight:5.0)
			element.category = fun
			element.save(flush: true, insert: true)

			fun.save(flush:true)

			new Element(name:'testing',positive:true,weight:9.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'kiss',positive:true,weight:10.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'refactoring',positive:true,weight:7.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'reviews',positive:true,weight:8.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'learning',positive:true,weight:9.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'prototyping',positive:true,weight:7.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'inspection',positive:true,weight:5.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'continuous delivery',positive:true,weight:5.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'improvement',positive:true,weight:8.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'make work visible',positive:true,weight:6.0)
			element.category = quality
			element.save(flush: true, insert: true)

			element = new Element(name:'wiki',positive:true,weight:7.0)
			element.category = quality
			element.save(flush: true, insert: true)

			quality.save(flush:true)

			new Element(name:'complexity',positive:false,weight:4.0)
			element.category = impediments
			element.save(flush: true, insert: true)

			element = new Element(name:'missing software',positive:false,weight:4.0)
			element.category = impediments
			element.save(flush: true, insert: true)

			element = new Element(name:'broken build',positive:false,weight:10.0)
			element.category = impediments
			element.save(flush: true, insert: true)

			element = new Element(name:'missing people',positive:false,weight:10.0)
			element.category = impediments
			element.save(flush: true, insert: true)

			impediments.save(flush:true)


			new Element(name:'technical debt',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			element = new Element(name:'open issues',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			element = new Element(name:'not complete',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			element = new Element(name:'failure',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			element = new Element(name:'design smell',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			element = new Element(name:'code smell',positive:false,weight:4.0)
			element.category = wrong
			element.save(flush: true, insert: true)

			wrong.save(flush:true)


			//impacts
			new Impact(name: 'minimal',value: 0.0).save()
			new Impact(name: 'low',value: 3.0).save()
			new Impact(name: 'average',value: 5.0).save()
			new Impact(name: 'high',value: 8.0).save()
			new Impact(name: 'maximal',value: 10.0).save()

			new Impact(name: 'good',value: 7.0).save()
			new Impact(name: 'ok',value: 5.0).save()
			new Impact(name: 'bad',value: 3.0).save()

			new Impact(name: 'much',value: 7.0).save()
			new Impact(name: 'means',value: 5.0).save()
			new Impact(name: 'little',value: 2.0).save()

		} catch (Exception e) {
			e.printStackTrace()
		}

	}
	def destroy = {
	}
}
