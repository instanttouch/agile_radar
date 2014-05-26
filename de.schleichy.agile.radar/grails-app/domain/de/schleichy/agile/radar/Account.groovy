package de.schleichy.agile.radar

class Account {

	long id
	String name

	static searchable = true
	static hasMany = [snapshots:Snapshot]


	static constraints = {
		name(nullable:false)
	}

	static mapping = { sort name: "asc" }
	
	public String toString() {
		return name
	}
}
