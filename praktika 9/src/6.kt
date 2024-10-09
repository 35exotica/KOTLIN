fun sortStrings(arr: List<String>): List<String> {
    return arr.sorted()
}

fun main() {
    val strings = listOf("apple", "banana", "cherry", "date")
    println(sortStrings(strings))
}
