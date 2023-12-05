package _2023_12_5

private fun solution(time12: String): String {
  val p = time12.slice(time12.length - 2..<time12.length)
  var (hour, minute, sec) = time12.split(":")
  
  if (p == "AM") {
    if (hour == "12") {
      hour = String.format("%02d", hour.toInt() - 12)
    }
  } else {
    if (hour != "12") {
      hour = (hour.toInt() + 12).toString()
    }
  }
  
  return "$hour:$minute:$sec"
}


fun main() {
  val time12 = "07:05:45PM"
  println(solution(time12))
}