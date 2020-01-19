fun main ( args : Array<String>){
	/*
 		1. ũ�� 5�� Array ����
 		2. fun maxCheck �Լ��� �Ű����� Array
 		3. maxCheck ���� ������������ ���� �� Array ��ȯ
 		4. println Array
	 */
	
	var inputArray = arrayOf(20,30,50,40,10)
	//var anotherArray = Array<Int>(5,{0})
	
	var outputArray = maxCheck(inputArray)
	for(value in outputArray){
		print("$value ")
	}
	
}

fun maxCheck(inputArray: Array<Int>) : Array<Int>{
	for(i in 0..inputArray.size-1){
		for(j in 0..inputArray.size-1){
			if(inputArray[i]<inputArray[j]){
				var temp:Int = inputArray[i]
				inputArray[i]=inputArray[j]
				inputArray[j]=temp
			}
		}
	}
	return inputArray
}

