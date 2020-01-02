fun main(args: Array<String>) {
	var ps1 = Person1("hong","gildong")
	println(ps1.get())
	
	var ps1_1 = Person1_2("kim","sumin")
	println(ps1_1.age)
	
	var ps2 = Person2("song","yeonggon",20)
	println(ps2.getFullName())
}

//Primary Constructor
class Person1(val firstName: String, val lastName : String) {
	var age : Int
	init {
		age = 0
	}
	fun get():String = firstName + " " + lastName
}

class Person1_2(val firstName: String, val lastName : String, var age : Int = 12) {
	fun get():String = firstName + " " + lastName
}

// Secondary Constructor
class Person2 {
	val firstName : String
	val lastName : String
	var age : Int
	
	constructor(firstName : String, lastName : String , age : Int){
		this.firstName = firstName
		this.lastName = lastName
		this.age = age
	}
	
	fun getFullName():String = firstName+ " " + lastName
}