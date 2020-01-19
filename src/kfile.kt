fun main(argv: Array<String>) {
	println("Hello Kotlin")
	var a = 1
	val b = 1 // -> 자바: final 

	//기본변수는 null을 가질 수 없음
	var c: Int? = null
	
	val arrayList = ArrayList<String>()
	arrayList.add("list_add")
	for (s in arrayList) {
		println(s)
	}
}

fun sum(a: Int, b: Int): Int {
	return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun abc(abc: Int): Int? {
	return abc
}

// Any 는 자바에서 Object 
fun getStringLength(obj: Any): Int? {
	// not 표현은 is앞에 ! -> obj !is String
	if (obj is String) {
		return obj.length
	}
	return null
}
 



