package _2023_12_5

private fun solution(strings: Array<String>, queries: Array<String>) {
  val answer = mutableListOf<Int>()
  for (query in queries) {
    answer.add(strings.count { it == query })
  }
  println(answer)
}

fun main() {
  val strings = arrayOf("def", "de", "fgh")
  val queries = arrayOf("de", "lmn", "fgh")
  solution(strings, queries)
}