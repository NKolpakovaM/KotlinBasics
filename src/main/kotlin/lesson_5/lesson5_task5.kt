import kotlin.random.Random

fun main() {
    val winningNumbers = generateWinningNumbers()
    val userNumbers = getUserNumbers()
    val matchedCount = countMatches(winningNumbers, userNumbers)

    when (matchedCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        0 -> println("Вы не угадали ни одного числа.")
    }
    println("Выигрышные числа: $winningNumbers")
}

fun generateWinningNumbers(): List<Int> {
    val numbers = mutableListOf<Int>()
    while (numbers.size < 3) {
        val randomNumber = Random.nextInt(1, 43)
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber)
        }
    }
    return numbers
}

fun getUserNumbers(): List<Int> {
    val numbers = mutableListOf<Int>()
    while (numbers.size < 3) {
        print("Введите число от 1 до 42 (${numbers.size + 1} из 3): ")
        val input = readLine()
        val number = input?.toIntOrNull()
        if (number != null && number in 1..42 && !numbers.contains(number)) {
            numbers.add(number)
        } else {
            println("Некорректный ввод. Попробуйте еще раз.")
        }
    }
    return numbers
}

fun countMatches(winningNumbers: List<Int>, userNumbers: List<Int>): Int {
    var count = 0
    for (winningNumber in winningNumbers) {
        if (userNumbers.contains(winningNumber)) {
            count++
        }
    }
    return count
}
