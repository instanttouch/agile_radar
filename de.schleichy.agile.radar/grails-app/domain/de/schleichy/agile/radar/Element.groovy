package de.schleichy.agile.radar

class Element {

	long id
	String name
	Double weight
	Boolean positive

	static searchable = true

	static constraints = {
		name(unique:true)
		positive(nullable:true)
		weight(nullable:true,range:0..10)
		category(nullable:true)
	}

	static mapping = { sort name: "asc" }
	static belongsTo =  [ category : Category ]
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void create(String name, boolean isPositive, double weight, Category category){
		Element element = Element.findByName(name)
		if(!element){
			element = new Element(name:name,positive:isPositive,weight:weight).save()
		}
		element.category = category
		element.save()
	}
	
}
