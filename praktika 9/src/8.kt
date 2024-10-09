import kotlin.random.Random
import kotlin.system.exitProcess

fun guessNumberGame() {
    val numberToGuess = Random.nextInt(1, 101)
    var guess: Int

    while (true) {
        println("Введите ваше число:")
        guess = readln().toInt()

        when {
            guess < numberToGuess -> println("Загаданное число больше")
            guess > numberToGuess -> println("Загаданное число меньше")
            else -> {
                println("Поздравляем, вы угадали!")
                exitProcess(0)
            }
        }
    }
}

fun main() {
    guessNumberGame()
}
