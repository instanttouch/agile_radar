import de.schleichy.agile.radar.Impact
import de.schleichy.agile.radar.Category
import de.schleichy.agile.radar.Element

class BootStrap {

	def init = { servletContext ->

		//categories
		try {
			def goal = Category.findByName('Goal')
			if(!goal){
				goal = new Category(name:'Goal',positive:true) 
			} 
			
			def fun = Category.findByName('Fun')
			if(!fun){
				fun = new Category(name:'Fun',positive:true) 
			} 

			def wrong = Category.findByName('Wrong')
			if(!wrong){
				wrong = new Category(name:'Wrong',positive:true) 
			} 

			def impediments = Category.findByName('Impediments')
			if(!impediments){
				impediments = new Category(name:'Impediments',positive:true) 
			} 

			def quality = Category.findByName('Quality')
			if(!quality){
				quality = new Category(name:'Quality',positive:true) 
			} 

			//elements
			Element.create('velocity',true,7.0,goal);
			Element.create('estimation',true,7.0,goal);
			Element.create('functionality',true,9.0,goal);
			Element.create('open for change',true,6.0,goal);
			Element.create('business value',true,8.0,goal);
			Element.create('big picture',true,10.0,goal);
			Element.create('product vision',true,10.0,goal);
			Element.create('clearness',true,8.0,goal);
			Element.create('meaningful stories',true,7.0,goal);
			Element.create('focus',true,9.0,goal);
			Element.create('velocity',true,7.0,goal);
			Element.create('velocity',true,7.0,goal);
			
			goal.save(flush:true)
			
			Element.create('pair programming',true,8.0,fun);
			Element.create('pair design',true,8.0,fun);
			Element.create('communication',true,10.0,fun);
			Element.create('openness',true,6.0,fun);
			Element.create('respect',true,9.0,fun);
			Element.create('collaboration',true,10.0,fun);
			Element.create('flow',true,7.0,fun);
			Element.create('humanity',true,10.0,fun);
			Element.create('motivation',true,10.0,fun);
			Element.create('self organizing team',true,7.0,fun);
			Element.create('supportive culture',true,6.0,fun);
			Element.create('diversity',true,4.0,fun);
			Element.create('white board',true,8.0,fun);
			Element.create('collective code ownership',true,8.0,fun);
			
			fun.save(flush:true)

			Element.create('TDD',true,10.0,quality);
			Element.create('KISS',true,9.0,quality);
			Element.create('refactoring',true,6.0,quality);
			Element.create('reviews',true,5.0,quality);
			Element.create('learning',true,6.0,quality);
			Element.create('prototyping',true,7.0,quality);
			Element.create('inspection',true,4.0,quality);
			Element.create('continuous delivery',true,8.0,quality);
			Element.create('continuous improvment',true,9.0,quality);
			Element.create('make work visible',true,8.0,quality);
			Element.create('wiki',true,7.0,quality);

			quality.save(flush:true)

			Element.create('complexity',true,7.0,impediments);
			Element.create('tools',true,5.0,impediments);
			Element.create('broken build',true,10.0,impediments);
			Element.create('missing people',true,8.0,impediments);
			
			impediments.save(flush:true)

			Element.create('technical debt',true,6.0,wrong);
			Element.create('open issues',true,8.0,wrong);
			Element.create('not complete',true,7.0,wrong);
			Element.create('failure',true,7.0,wrong);
			Element.create('design smell',true,8.0,wrong);
			Element.create('code smell',true,9.0,wrong);
			
			element.category = wrong


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
