fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

fun findPrimesUpToN(N: Int) {
    for (i in 2..N) {
        if (isPrime(i)) println(i)
    }
}

fun main() {
    findPrimesUpToN(50)
}
