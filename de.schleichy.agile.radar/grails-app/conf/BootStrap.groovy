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
			def element = Element.findByName('velocity')
			if(!element){
				element = new Element(name:'velocity',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal			
			
			element = Element.findByName('estimation')
			if(!element){
				element = new Element(name:'estimation',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			element = Element.findByName('functionality')
			if(!element){
				element = new Element(name:'functionality',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			
			element = Element.findByName('open for change')
			if(!element){
				element = new Element(name:'open for change',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			
			element = Element.findByName('business value')
			if(!element){
				element = new Element(name:'business value',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			
			element = Element.findByName('big picture')
			if(!element){
				element = new Element(name:'big picture',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			element = Element.findByName('product vision')
			if(!element){
				element = new Element(name:'product vision',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			element = Element.findByName('clearness')
			if(!element){
				element = new Element(name:'clearness',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			element = Element.findByName('meaningful stories')
			if(!element){
				element = new Element(name:'meaningful stories',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			element = Element.findByName('focus')
			if(!element){
				element = new Element(name:'focus',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = goal

			goal.save(flush:true)
			

			element = Element.findByName('pair programming')
			if(!element){
				element = new Element(name:'pair programming',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('pair design')
			if(!element){
				element = new Element(name:'pair design',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('communication')
			if(!element){
				element = new Element(name:'communication',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('openness')
			if(!element){
				element = new Element(name:'openness',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('respect')
			if(!element){
				element = new Element(name:'respect',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('collaboration')
			if(!element){
				element = new Element(name:'collaboration',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('flow')
			if(!element){
				element = new Element(name:'flow',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('humanity')
			if(!element){
				element = new Element(name:'humanity',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('motivation')
			if(!element){
				element = new Element(name:'motivation',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('self organizing team')
			if(!element){
				element = new Element(name:'self organizing team',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('supportive culture')
			if(!element){
				element = new Element(name:'supportive culture',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			element = Element.findByName('diversity')
			if(!element){
				element = new Element(name:'diversity',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun
			
			element = Element.findByName('white board')
			if(!element){
				element = new Element(name:'white board',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun


			element = Element.findByName('collective code ownership')
			if(!element){
				element = new Element(name:'collective code ownership',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = fun

			fun.save(flush:true)

			element = Element.findByName('TDD')
			if(!element){
				element = new Element(name:'TDD',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('KISS')
			if(!element){
				element = new Element(name:'KISS',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('refactoring')
			if(!element){
				element = new Element(name:'refactoring',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('reviews')
			if(!element){
				element = new Element(name:'reviews',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('learning')
			if(!element){
				element = new Element(name:'learning',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('prototyping')
			if(!element){
				element = new Element(name:'prototyping',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('inspection')
			if(!element){
				element = new Element(name:'inspection',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('continuous delivery')
			if(!element){
				element = new Element(name:'continuous delivery',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('improvement')
			if(!element){
				element = new Element(name:'improvement',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('make work visible')
			if(!element){
				element = new Element(name:'make work visible',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			element = Element.findByName('wiki')
			if(!element){
				element = new Element(name:'wiki',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = quality

			quality.save(flush:true)

			element = Element.findByName('complexity')
			if(!element){
				element = new Element(name:'complexity',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = impediments

			element = Element.findByName('tools')
			if(!element){
				element = new Element(name:'tools',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = impediments

			element = Element.findByName('broken build')
			if(!element){
				element = new Element(name:'broken build',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = impediments

			element = Element.findByName('missing people')
			if(!element){
				element = new Element(name:'missing people',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = impediments

			impediments.save(flush:true)

			element = Element.findByName('technical debt')
			if(!element){
				element = new Element(name:'technical debt',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = wrong


			element = Element.findByName('open issues')
			if(!element){
				element = new Element(name:'open issues',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = wrong

			element = Element.findByName('not complete')
			if(!element){
				element = new Element(name:'not complete',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = wrong

			element = Element.findByName('failure')
			if(!element){
				element = new Element(name:'failure',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = wrong

			element = Element.findByName('design smell')
			if(!element){
				element = new Element(name:'design smell',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
			element.category = wrong

			element = Element.findByName('code smell')
			if(!element){
				element = new Element(name:'code smell',positive:true,weight:7.0)
				element.save(flush: true, insert: true)
			}
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
