package _2023_12_5

private fun solution(arr: IntArray) {
  val maxSum = arr.sum() - arr.min()
  val minSum = arr.sum() - arr.max()
  println("$minSum $maxSum")
}

fun main() {
  val arr = intArrayOf(1, 2, 3, 4, 5)
  solution(arr)
}

