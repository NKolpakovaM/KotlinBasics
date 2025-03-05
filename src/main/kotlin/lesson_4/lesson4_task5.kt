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
            (!isShipDamaged && shipStaffNumber in MIN_STAFF_NUMBER..MAX_STAFF_NUMBER && provisionBoxesNumber > MIN_PROVISION_BOXES) ||
                    (isShipDamaged && shipStaffNumber == MAX_STAFF_NUMBER && isWeatherGood && provisionBoxesNumber >= MIN_PROVISION_BOXES)
            )
    println("Может ли корабль отправиться в плавание? Ответ: $sailAllowed")
}
val MIN_STAFF_NUMBER = 55
val MAX_STAFF_NUMBER = 70
val MIN_PROVISION_BOXES = 50