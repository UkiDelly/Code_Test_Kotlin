package _2023_09_22

//# 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
//
//문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.

private fun solution(myString:String,pat:String):String{

	val answer = myString.lastIndexOf(pat).let{
		myString.substring(0,it + pat.length)
	}


    return answer
}

private fun anotherSolution(myString:String,pat:String):String{
	return myString.substringBeforeLast(pat) + pat
}

fun main(){
    val result = solution("AbCdEFG", "dE")

	println(result)

	val result2 = anotherSolution("AbCdEFG", "dE")
	println(result2)
}
