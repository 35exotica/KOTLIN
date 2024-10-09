fun currencyConverter(amount: Double, rate: Double): Double {
    return amount * rate
}

fun main() {
    val dollars = 100.0
    val rate = 0.85  // курс доллара к евро
    println("Конвертированные евро: ${currencyConverter(dollars, rate)}")
}
