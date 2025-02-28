fun main () {
    val tablesNumber = 13
    var bookedTablesToday = 13
    var bookedTablesTomorrow = 9
    var freeTablesToday = tablesNumber - bookedTablesToday
    var freeTablesTomorrow = tablesNumber - bookedTablesTomorrow
    val availabilityToday = freeTablesToday == 0
    val availabilityTomorrow = freeTablesTomorrow == 0
    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}