package de.schleichy.agile.radar


class Entry {

	long id	
	Element element
	Impact value
	
    static constraints = {
		element(nullable:false)
		value(nullable:false)
    }
	
	public String toString() {
		return "$element : $value";
	}

	static mapping = { sort snapshot: "desc" }	
	
	static belongsTo =  [ snapshot : Snapshot ]
}
