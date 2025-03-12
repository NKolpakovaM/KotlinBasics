fun main() {
    println("Введите число для таблицы умножения:")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number == null) {
        println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число.")
    } else {
        for (i in 1..10) {
            val result = number * i
            println("$number x $i = $result")
        }
    }
}