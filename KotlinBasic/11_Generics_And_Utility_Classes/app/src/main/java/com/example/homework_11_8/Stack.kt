class Stack<T> {
    private val items = arrayListOf<T>()

    fun push(item: T)= items.add(0, item)

    fun pop(): T? = items.removeFirstOrNull()

    fun isEmpty(): Boolean = items.isEmpty()
}