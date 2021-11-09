package key_concepts

class LinkedListNode(var data: Int) {

    var next: LinkedListNode? = null

    fun appendToTail(data: Int) {
        val end = LinkedListNode(data)
        var node: LinkedListNode = this
        while (node.next != null) {
            node = node.next!!
        }
        node.next = end
    }

}