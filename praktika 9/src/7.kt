fun swapCase(s: String): String {
    return s.map {
        if (it.isLowerCase()) it.toUpperCase() else it.toLowerCase()
    }.joinToString("")
}

fun main() {
    println(swapCase("HeLLo WoRLd"))  // "hEllO wOrlD"
}
