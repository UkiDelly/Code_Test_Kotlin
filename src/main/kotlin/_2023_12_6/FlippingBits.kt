package _2023_12_6

private fun solution(number: Int): UInt {
  return number.toUInt().inv()
}

fun main() {
  println(solution(3))
  println(solution(2147483647))
  println(solution(1))
  println(solution(0))
}