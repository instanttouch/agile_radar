package de.schleichy.agile.radar

class Impact {

	long id
	String name
	Double value

	static constraints = {
		name(unique:true)
		value(nullable:true,range:0..10)
	}

	static mapping = { sort name: "asc" }


	@Override
	public String toString() {
		return name;
	}
}
