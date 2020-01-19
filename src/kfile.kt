fun main(argv: Array<String>) {
	println("Hello Kotlin")
	var a = 1
	val b = 1 // -> �ڹ�: final 

	//�⺻������ null�� ���� �� ����
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

// Any �� �ڹٿ��� Object 
fun getStringLength(obj: Any): Int? {
	// not ǥ���� is�տ� ! -> obj !is String
	if (obj is String) {
		return obj.length
	}
	return null
}
 



