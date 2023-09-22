package _2023_09_22

//# 공백으로 구분하기 2
//
//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, <br>
//my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

private fun solution(myString:String):List<String>{
	return myString.split(" ").filter { it.isNotBlank() }.toList()
}

private fun anotherSoluttion(myString: String):List<String>{
	return myString.trim().split("\\s+".toRegex())
}


fun main(){
	val result = solution(" i    love  you")
	println(result.toString())

	val anotherResult = anotherSoluttion(" i    love  you")
	println(anotherResult.toString())
}