import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()"
    return (1..length)
        .map { chars.random() }
        .joinToString("")
}

fun main() {
    println(generatePassword(12))  // Пример с длиной 12 символов
}
