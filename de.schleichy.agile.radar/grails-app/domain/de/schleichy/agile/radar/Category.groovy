package de.schleichy.agile.radar

class Category {

	long id
	String name
	Boolean positive	

	static searchable = true
	static hasMany = [elements:Element]

	static constraints = { 
		name(unique:true)
		positive(nullable:true)
	}

	static mapping = { sort name: "asc" }	
	
	@Override
	public String toString() {
		return name;
	}
}
