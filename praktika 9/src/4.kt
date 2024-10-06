fun areAnagrams(s1: String, s2: String): Boolean {
    return s1.toLowerCase().toCharArray().sorted() == s2.toLowerCase().toCharArray().sorted()
}

fun main() {
    println(areAnagrams("listen", "silent"))  // true
    println(areAnagrams("hello", "world"))  // false
}
