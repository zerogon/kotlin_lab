fun main(args: Array<String>) {
	var arrayList = ArrayList<String>()
	arrayList.add("aa")
	arrayList.add("bb")
	
	for( x in 0 .. arrayList.size-1){
		println(arrayList[x])
	}
	println("------------------")
	for ( x in arrayList){
		println(x)
	}
	println("------------------")
	for ( x in arrayList.size-1 downTo 0){
		println(arrayList[x])
	}
}
