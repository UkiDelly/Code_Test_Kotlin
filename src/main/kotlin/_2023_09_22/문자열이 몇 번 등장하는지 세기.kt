package _2023_09_22

//# 문자열이 몇 번 등장하는지 세기
//
//문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
private fun solution(myString: String, pat: String): Int {

	var answer = 0
	for (i in myString.indices) {
		if (myString.substring(i).startsWith(pat)) {
			answer++
		}
	}
	return answer
}


fun main() {
	val result = solution("banana", "ana")

	print(result)
}