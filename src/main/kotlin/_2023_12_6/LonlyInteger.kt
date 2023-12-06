package _2023_12_6

private fun solution(intList: IntArray): Int {
  
  // find the most unique value in the array
  val counter = intList.groupBy { it }.minBy { it.value.size }
  return counter.key
}

fun main() {
  val randomInt =
    intArrayOf(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11)
  println(solution(randomInt))
}