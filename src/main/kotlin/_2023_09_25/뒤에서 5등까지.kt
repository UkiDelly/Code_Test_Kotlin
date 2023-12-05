package _2023_09_25

//# 뒤에서 5등까지
//
//정수로 이루어진 리스트 num_list가 주어집니다. <br>
//num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

private fun solution(num_list:IntArray):IntArray{
	val sortList = num_list.sorted()
	return sortList.subList(0,4).toIntArray()
}

private fun anotherSolution(numList:IntArray) :IntArray{
	return numList.sorted().take(5).toIntArray()
}

fun main(){

	val result = solution(intArrayOf(12, 4, 15, 46, 38, 1, 14))

	print(result.toString())
}
