const val MIN_STAFF_NUMBER = 55
const val MAX_STAFF_NUMBER = 70
const val MIN_PROVISION_BOXES = 50
const val GOOD_WEATHER = true
const val NO_DAMAGE = false

fun main() {
    println("Введите данные о корабле")

    println("Укажите факт наличия повреждений корабля (напишите true/false):")
    val isShipDamaged = readln().toBooleanStrictOrNull() ?: false

    println("Количество человек в экипаже:")
    val shipStaffNumber = readln().toIntOrNull() ?: 0

    println("Количество ящиков с провизией:")
    val provisionBoxesNumber = readln().toIntOrNull() ?: 0

    println("Введите данные о погоде (напишите true/false):")
    val isWeatherGood = readln().toBooleanStrictOrNull() ?: false

    val sailAllowed = (
            (isShipDamaged != NO_DAMAGE && shipStaffNumber in MIN_STAFF_NUMBER..MAX_STAFF_NUMBER && provisionBoxesNumber > MIN_PROVISION_BOXES) ||
                    (isShipDamaged != NO_DAMAGE && shipStaffNumber == MAX_STAFF_NUMBER && isWeatherGood == GOOD_WEATHER && provisionBoxesNumber >= MIN_PROVISION_BOXES)
            )
    println("Может ли корабль отправиться в плавание? Ответ: $sailAllowed")
}
