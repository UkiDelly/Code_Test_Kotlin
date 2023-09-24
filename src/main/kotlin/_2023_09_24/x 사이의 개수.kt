package _2023_09_24

//# x 사이의 개수
//
//문자열 myString이 주어집니다.<br>
//myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.


private fun solution(myString:String):List<Int>{
	return myString.split("x").map{ it.length }
}

fun main(){

	val result = solution("oxooxoxxox")
	println(result)
}