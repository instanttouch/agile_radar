package de.schleichy.agile.radar

import java.util.Date;

class Snapshot {

	long id
	String name
    Date dateCreated = new Date()

	static searchable = true
	static hasMany = [entries:Entry]

	static constraints = {
		name(nullable:true)
		account(nullable:true)
		dateCreated(nullable:false,format:"dd.MM.yyyy")
	}

	static mapping = { sort dateCreated: "desc" }	
	static belongsTo =  [ account : Account ]
	
	public String toString() {
		return account.name + "_" + dateCreated.format("dd.MM.yyyy")
	}
}
