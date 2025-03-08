fun main () {
    var number1 = 236
    var number2 = 3
    val sum = number1 + number2
    println("Введите сумму чисел: $number1 и $number2")
    var input = readln().toIntOrNull()
    if (input == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}