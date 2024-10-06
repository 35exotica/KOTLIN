import kotlin.random.Random

fun generateRandomNumbers() {
    repeat(10) {
        val randomNum = Random.nextInt(1, 101)
        println(randomNum)
    }
}

fun main() {
    generateRandomNumbers()
}
