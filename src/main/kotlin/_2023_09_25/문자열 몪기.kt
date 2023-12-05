package _2023_09_25

//# 문자열 묶기
//
//문자열 배열 strArr이 주어집니다. <br>
//strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

private fun solution(strArr:Array<String>):Int{
	val d = mutableMapOf<Int,Int>()

	for (str in strArr.iterator()){
		val length = str.length
		d[length] = d.getOrDefault(length,0) + 1
	}

	return d.values.maxOf { it }
}


private fun anotherSolution(strArr:Array<String>):Int{
	return strArr.groupBy { it.length }.maxOf {(k,v) -> v.size }
}


fun main(){

	val result = solution(arrayOf("a", "bc", "d", "efg", "hi"))
	println(result)

	val result2 = anotherSolution(arrayOf("a", "bc", "d", "efg", "hi"))
	println(result2)

}