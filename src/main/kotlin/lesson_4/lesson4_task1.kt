fun main () {
    val tablesNumber = 13
    var bookedTablesToday = 13
    var bookedTablesTomorrow = 9
    var freeTablesToday = tablesNumber - bookedTablesToday
    var freeTablesTomorrow = tablesNumber - bookedTablesTomorrow
    if (freeTablesToday > 0) {
        println("Доступность столиков на сегодня: true")
    } else println("Доступность столиков на сегодня: false")
    if (freeTablesTomorrow > 0) {
        println("Доступность столиков на завтра: true")
    } else println("Доступность столиков на завтра: false")
}