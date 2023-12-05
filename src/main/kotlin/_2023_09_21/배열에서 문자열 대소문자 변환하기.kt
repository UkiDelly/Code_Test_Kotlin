package _2023_09_21

fun main() {
  
  var result = solution(arrayOf("AAA", "BBB", "CCC", "DDD"))
  
  print(result.toString())
  
}


private fun solution(strArr: Array<String>): Array<String> {
  return strArr.mapIndexed { index, s -> if (index % 2 != 0) s.uppercase() else s.lowercase() }.toTypedArray()
}