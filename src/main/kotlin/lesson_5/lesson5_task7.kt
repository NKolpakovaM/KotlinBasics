fun main() {
    fun readPositiveDouble(prompt: String): Double {
        println(prompt)
        while (true) {
            val input = readLine()?.toDoubleOrNull()
            if (input != null && input > 0) {
                return input
            } else {
                println("Ошибка! Пожалуйста, введите положительное число.")
            }
        }
    }

    val distance = readPositiveDouble("Введите расстояние поездки (км): ")
    val consumptionPer100km = readPositiveDouble("Введите расход топлива на 100 км (л): ")
    val fuelPrice = readPositiveDouble("Введите текущую цену за литр топлива: ")

    val totalFuel = (distance * consumptionPer100km) / 100
    val totalCost = totalFuel * fuelPrice

    println("Необходимо топлива: $totalFuel л")
    println("Общая стоимость поездки: %.2f".format(totalCost))
}