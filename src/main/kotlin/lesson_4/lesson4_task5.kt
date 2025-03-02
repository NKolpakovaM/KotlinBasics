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
            (!isShipDamaged && shipStaffNumber in 55..70 && provisionBoxesNumber > 50) ||
                    (isShipDamaged && shipStaffNumber == 70 && isWeatherGood && provisionBoxesNumber >= 50)
            )
    println("Может ли корабль отправиться в плавание? $sailAllowed")
}
