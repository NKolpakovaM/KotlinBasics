const val LOWER_WEIGHT = 35
const val UPPER_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main() {
    var weight = 20
    var volume = 80
    println("Это ${if (weight >= LOWER_WEIGHT && weight <= UPPER_WEIGHT && volume >= AVERAGE_VOLUME) "средний груз" else "не средний груз"}")

    weight = 50
    volume = 100
    println("Это ${if (weight >= LOWER_WEIGHT && weight <= UPPER_WEIGHT && volume >= AVERAGE_VOLUME) "средний груз" else "не средний груз"}")
}
