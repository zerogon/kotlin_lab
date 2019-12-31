fun main(args: Array<String>) {
    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // Long
    cases("hello") // Unknown
	
	val arrayList = ArrayList<String>()
	arrayList.add("첫번째")
	arrayList.add("두번째")
	
	for( x in 0 .. arrayList.size-1){
		println(arrayList[x])
	}
}

fun cases(obj:Any){
	when (obj){
		1 -> println("One")
		"Hello" -> println("Greeting")
		is Long -> println("Long")
		!is String -> println("Not a string")
		else -> println("Unknown")
	}
}