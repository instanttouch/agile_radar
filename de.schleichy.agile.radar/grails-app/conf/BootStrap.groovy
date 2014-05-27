import de.schleichy.agile.radar.Impact
import de.schleichy.agile.radar.Category
import de.schleichy.agile.radar.Element

class BootStrap {

    def init = { servletContext ->
		
		//categories
		def goal = new Category(name:'Goal',positive:true)
		goal.save(flush: true,insert: true)
		def fun = new Category(name:'Fun',positive:true)
		fun.save(flush: true,insert: true)
		def wrong = new Category(name:'Wrong',positive:false)
		wrong.save(flush: true,insert: true)
		def impediments = new Category(name:'Impediments',positive:false)
		impediments.save(flush: true,insert: true)
		def quality = new Category(name:'Quality',positive:true)
		quality.save(flush: true,insert: true)
		
		//elements
		new Element(name:'velocity',positive:true,weight:7,category:goal).save(flush: true,insert: true)
		new Element(name:'estimation',positive:true,weight:8,category:goal).save(flush: true,insert: true)
		new Element(name:'functionality',positive:true,weight:9,category:goal).save(flush: true)
		new Element(name:'open for change',positive:true,weight:6,category:goal).save(flush: true)
		new Element(name:'business value',positive:true,weight:8	,category:goal).save(flush: true)
		new Element(name:'big picture',positive:true,weight:9,category:goal).save(flush: true)
		new Element(name:'product vision',positive:true,weight:10,category:goal).save(flush: true)
		new Element(name:'clearness',positive:true,weight:7,category:goal).save(flush: true)
		
		new Element(name:'pair programming',positive:true,weight:9,category:fun).save(flush: true)
		new Element(name:'pair design',positive:true,weight:5,category:fun).save(flush: true)
		new Element(name:'communication',positive:true,weight:10,category:fun).save(flush: true)
		new Element(name:'openness',positive:true,weight:8,category:fun).save(flush: true)
		new Element(name:'respect',positive:true,weight:8,category:fun).save(flush: true)
		new Element(name:'collaboration ',positive:true,weight:10,category:fun).save(flush: true)
		new Element(name:'flow',positive:true,weight:8,category:fun).save(flush: true)
		new Element(name:'humanity',positive:true,weight:10,category:fun).save(flush: true)
		new Element(name:'motivation',positive:true,weight:10,category:fun).save(flush: true)
		new Element(name:'self organizing team',positive:true,weight:7,category:fun).save(flush: true)
		new Element(name:'supportive culture',positive:true,weight:10,category:fun).save(flush: true)
		new Element(name:'diversity',positive:true,weight:5,category:fun).save(flush: true)
		new Element(name:'white board',positive:true,weight:5,category:fun).save(flush: true)
		
		new Element(name:'testing',positive:true,weight:9,category:quality).save(flush: true)
		new Element(name:'kiss',positive:true,weight:10,category:quality).save(flush: true)
		new Element(name:'refactoring',positive:true,weight:7,category:quality).save(flush: true)
		new Element(name:'reviews',positive:true,weight:8,category:quality).save(flush: true)
		new Element(name:'learning',positive:true,weight:9,category:quality).save(flush: true)
		new Element(name:'prototyping',positive:true,weight:7,category:quality).save(flush: true)
		new Element(name:'inspection',positive:true,weight:5,category:quality).save(flush: true)
		new Element(name:'continuous delivery',positive:true,weight:5,category:quality).save(flush: true)
		new Element(name:'improvement',positive:true,weight:8,category:quality).save(flush: true)
		new Element(name:'make work visible',positive:true,weight:6,category:quality).save(flush: true)
		new Element(name:'wiki',positive:true,weight:7,category:quality).save(flush: true)
		
		new Element(name:'complexity',positive:false,weight:4,category:impediments).save(flush: true)
		new Element(name:'missing software',positive:false,weight:4,category:impediments).save(flush: true)
		new Element(name:'broken build',positive:false,weight:10,category:impediments).save(flush: true)		
		
		new Element(name:'technical debt',positive:false,weight:4,category:wrong).save(flush: true)
		new Element(name:'open issues',positive:false,weight:4,category:wrong).save(flush: true)
		new Element(name:'not complete',positive:false,weight:4,category:wrong).save(flush: true)
		new Element(name:'failure',positive:false,weight:4,category:wrong).save(flush: true)
		
		//impacts
		new Impact(name: 'minimal',value: 0.0).save(flush: true)
		new Impact(name: 'low',value: 3.0).save(flush: true)
		new Impact(name: 'average',value: 5.0).save(flush: true)
		new Impact(name: 'high',value: 8.0).save(flush: true)
		new Impact(name: 'maximal',value: 10.0).save(flush: true)

		new Impact(name: 'good',value: 7.0).save(flush: true)
		new Impact(name: 'ok',value: 5.0).save(flush: true)
		new Impact(name: 'bad',value: 3.0).save(flush: true)

		new Impact(name: 'much',value: 7.0).save(flush: true)
		new Impact(name: 'means',value: 5.0).save(flush: true)
		new Impact(name: 'little',value: 2.0).save(flush: true)
				
    }
    def destroy = {
    }
}
