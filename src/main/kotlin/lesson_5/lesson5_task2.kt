fun main () {
    val currentYear: Int = 2025
    println("Введите год своего рождения:")
    val birthAgeInput = readln().toInt()
    val age: Int = currentYear - birthAgeInput
    println("Ваш возраст: $age")
}