package _2023_09_25

//# 배열 비교하기
//
//이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
//
//- 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
//- 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
//
//두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1,<br>
//두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.

private fun solution(arr1:IntArray, arr2:IntArray):Int{

	var answer:Int = 0
	if (arr1.size > arr2.size){
		answer = 1
	} else if (arr1.size < arr2.size) {
		answer = -1
	} else {
		if (arr1.sum() > arr2.sum()){ answer = 1 } else if(arr1.sum() < arr2.sum()) { answer = -1 }
	}
	return answer
}


// Comparator 인터페이스를 사용하여 비교
// v1.compareTo(v2)에서 v1이 큰 경우 1을, 값을 경우에는 0을, 작을 경우 -1을 리턴한다.
private fun anotherSolution(arr1:IntArray, arr2:IntArray):Int{
	val comparator = Comparator<IntArray> { o1, o2 ->
		if (o1.size == o2.size) o1.sum().compareTo(o2.sum())
		else o1.size.compareTo(o2.size)
	}
	return comparator.compare(arr1, arr2)
}

fun main(){
	val result = solution(intArrayOf(100, 17, 84, 1), intArrayOf(55, 12, 65, 36))
	println(result)

	val result2 = anotherSolution(intArrayOf(100, 17, 84, 1), intArrayOf(55, 12, 65, 36))
	println(result2)
}