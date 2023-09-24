package _2023_09_24

//간단한 식 계산하기
//문자열 binomial이 매개변수로 주어집니다. <br>
//binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '\*' 중 하나입니다.<br>
//주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

private fun solution(binomial:String):Int{

	val oper = mapOf(
		"+" to { x:Int,y:Int -> x+y },
		"-" to { x:Int,y:Int -> x-y },
		"*" to {x:Int,y:Int -> x*y},
		"/" to {x:Int,y:Int -> x/y}
	)

	val ( first,op,second) = binomial.split(" ")

	return oper[op]?.let { it( first.toInt(),second.toInt()) }!!

}


private fun anotherSolution(binomial:String):Int{

	val ( first,op,second ) = binomial.split(" ")

	return when(op){
		"+" -> first.toInt() + second.toInt()
		"-" -> first.toInt() - second.toInt()
		"*" -> first.toInt() * second.toInt()
		else -> first.toInt() / second.toInt()
	}
}

fun main(){
	val result = solution("43 + 12")
	println(result)
}