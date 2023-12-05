fun main() {

	println(pi(15))
}

private fun pi(count: Int): Double {
	var start = 2
	var answer = 3.0
	for (i in 1..count) {
		val deno = (start) * (start + 1) * (start + 2)
		val tmp = 4.0 / deno
		if (i % 2 == 0) {
			answer -= tmp
		} else {
			answer += tmp
		}
		start += 2
	}
	return answer
}