fun analyzeString(s: String) {
    val vowels = "aeiouAEIOU"
    val consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"

    val vowelCount = s.count { it in vowels }
    val consonantCount = s.count { it in consonants }

    println("Гласных: $vowelCount")
    println("Согласных: $consonantCount")
}

fun main() {
    analyzeString("hello world")
}
