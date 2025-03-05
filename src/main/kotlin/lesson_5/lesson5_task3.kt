val RIGHT_NUMBER1 = 3
val RIGHT_NUMBER2 = 7

fun main() {
    println("Угадайте два числа от 0 до 42 для участия в лотерее.")
    println("Введите первое число:")
    val input1 = readln().toIntOrNull()
    println("Введите второе число:")
    val input2 = readln().toIntOrNull()

    if (input1 == null || input2 == null) {
        println("Некорректный ввод.")
        return
    }

    val correctGuesses = (if (input1 == RIGHT_NUMBER1 || input1 == RIGHT_NUMBER2) 1 else 0) +
            (if (input2 == RIGHT_NUMBER1 || input2 == RIGHT_NUMBER2) 1 else 0)

    when (correctGuesses) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Выигрышные числа: $RIGHT_NUMBER1 и $RIGHT_NUMBER2")
    }
}
