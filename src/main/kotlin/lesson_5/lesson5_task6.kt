import java.lang.Math.pow

fun main() {
    var weight: Double = 0.0
    var heightCm: Double = 0.0
    var inputCorrect: Boolean

    do {
        inputCorrect = true
        print("Введите ваш вес (кг): ")
        weight = readDouble()
        if (weight <= 0) {
            println("Ошибка! Вес должен быть положительным числом.")
            inputCorrect = false
        }
        if (inputCorrect) {
            print("Введите ваш рост (см): ")
            heightCm = readDouble()
            if (heightCm <= 0) {
                println("Ошибка! Рост должен быть положительным числом.")
                inputCorrect = false
            }
        }
    } while (!inputCorrect)

    val heightM = heightCm / 100.0
    val bmi = weight / pow(heightM, 2.0)
    val bmiCategory = getBMICategory(bmi)

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория веса: $bmiCategory")
}

fun readDouble(): Double {
    while (true) {
        val input = readLine()
        val number = input?.toDoubleOrNull()
        if (number != null && number > 0) {
            return number
        } else {
            println("Некорректный ввод. Введите положительное число.")
        }
    }
}

fun getBMICategory(bmi: Double): String = when {
    bmi < 18.5 -> "Недостаточная масса тела"
    bmi < 25 -> "Нормальная масса тела"
    bmi < 30 -> "Избыточная масса тела"
    else -> "Ожирение"
}