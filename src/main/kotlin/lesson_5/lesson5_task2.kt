const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2025
    print("Введите год своего рождения: ")
    val birthYear = readLine()?.toIntOrNull()
    if (birthYear == null) {
        println("Некорректный ввод!")
        return
    }
    val age = currentYear - birthYear
    if (age >= AGE_OF_MAJORITY) {
        println("Контент доступен")
    } else {
        println("Контент запрещен (18+)")
    }
}
