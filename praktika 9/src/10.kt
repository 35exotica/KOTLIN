fun findLongestWord(sentence: String): String {
    val words = sentence.split("\\s+".toRegex()).map { it.replace(Regex("[^a-zA-Z]"), "") }
    return words.maxByOrNull { it.length } ?: ""
}

fun main() {
    println(findLongestWord("The quick brown fox jumps over the lazy dog."))
    println(findLongestWord("Hello, world!"))
}
