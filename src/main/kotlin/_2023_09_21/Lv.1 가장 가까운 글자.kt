package _2023_09_21

// 가장 가까운 같은 글자
//
//문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다. <br>
//예를 들어, s="banana"라고 할 때, 각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.<br>
//
//b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.<br>
//a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.<br>
//n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.<br>
//a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.<br>
//n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.<br>
//a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.<br>
//따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.<br>
//
//문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.

fun main(){
	val result = _solution("banana")
	println(result)
}


private fun _solution(s:String):List<Int>{
	val position = mutableMapOf<Char,Int>()
	val answer = mutableListOf<Int>()

	for ((index,char) in s.withIndex()){}

	s.mapIndexed { index, char ->
		if (position.containsKey(char)) {
			val prevIndex = position[char]!!
			answer.add(index - prevIndex)

		} else {
			answer.add(-1)
		}
		position[char] = index
	}

	return answer
}