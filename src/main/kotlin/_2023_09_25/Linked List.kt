package _2023_09_25

class Node<T>(var data: T, var next: Node<T>? = null) {

	override fun toString(): String {
		return this.data.toString()
	}
}


class LinkedList<T>(
	vararg data: T
) {

	var head: Node<T>? = null
	var tail: Node<T>? = null

	init {

		if (data.isEmpty()) {
			this.head = null
			this.tail = null
		} else {
			val nodeData = data.map { Node(it) }.toList()
			this.head = nodeData.first()
			this.tail = nodeData.last()


			var curr = this.head
			for (index in 1..<nodeData.size) {
				curr?.next = nodeData[index]
				curr = curr?.next!!
			}
		}
	}




	private fun len(): Int {
		var len = 0
		var curr = this.head
		while (curr != null) {
			len++
			curr = curr.next
		}
		return len
	}
	fun add(data: T) {
		val newNode = Node(data)
		this.tail?.next = newNode
		this.tail = newNode
	}

	fun pop(index:Int? = null):Node<T>{
		if ( len() == 0) throw IndexOutOfBoundsException()

		val poppingNode:Node<T>
		if (index == null) {
			poppingNode = tail!!

			val tailIndex = len()-1
			val newLastNode = this[tailIndex-1]
			newLastNode.next = null
			tail = newLastNode
		} else if (index > len()) {
			throw IndexOutOfBoundsException()
		} else {
			poppingNode = this[index]
			val prevNode = this[index - 1]
			prevNode.next = poppingNode.next
			tail = this[len()-1]
		}

		return poppingNode
	}


	fun insert(index:Int, data:T){
		val newNode = Node(data)
		if (index == 0) {
			newNode.next = head
			head = newNode
		} else if (index>len()) {
			add(data)
		} else if (index < 0) {
			throw IndexOutOfBoundsException()
		} else {
			val prevNode = this[index-1]
			newNode.next = prevNode.next
			prevNode.next = newNode
		}
	}



	operator fun get(index:Int):Node<T>{
		var curr = head
		for ( i in 0..<index) {
			curr = curr?.next
		}
		return curr ?: throw IndexOutOfBoundsException()
	}

	operator fun set(index:Int,data:T){
		val node = this[index]
		node.data = data
	}

	override fun toString(): String {
		println( "head:$head, tail:$tail" )
		var curr = this.head
		val nodeList = mutableListOf<Node<T>>()
		while (curr != null) {
			nodeList.add(curr)
			curr = curr.next
		}

		return nodeList.joinToString(" -> ")
	}
}


fun main() {

	val myList = LinkedList<Int>(1, 2, 3, 4)
	println(myList.toString())
	myList.add(5)
	println(myList.toString())

	val popped = myList.pop()
	println("popped: $popped")
	println(myList)


	myList.insert(100,5)
	println(myList)



}