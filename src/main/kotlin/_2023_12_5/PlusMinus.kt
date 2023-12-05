package _2023_12_5

private fun solution(arr: List<Int>) {
  val length = arr.size.toDouble()
  val p = (arr.count { it > 0 } / length)
  val n = (arr.count { it < 0 } / length)
  val z = (arr.count { it == 0 } / length)
  print(String.format("%.6f", p) + " ")
  print(String.format("%.6f", n) + " ")
  println(String.format("%.6f", z))
}

fun main() {
  val arr = listOf(- 4, 3, - 9, 0, 4, 1)
  solution(arr)
}
