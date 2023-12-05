package _2023_09_21

// A 강조하기
fun main() {
  
  val result = anotherSolution("abstract algebra")
  println(result)
}


// 내 대답
private fun solution(myString: String): String {
  
  
  return myString.map { if (it == 'a' || it == 'A') it.uppercase() else it.lowercase() }.joinToString("")
}


// 다른 대답
private fun anotherSolution(myString: String): String = myString.lowercase().replace('a', 'A')