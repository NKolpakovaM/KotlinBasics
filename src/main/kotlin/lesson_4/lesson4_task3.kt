fun main () {
    val sunnyWeather: Boolean = true
    val tentAvailable: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"
    val isGoodForGrowth: Boolean = sunnyWeather && tentAvailable && (humidity == 20) && !(season == "winter")
    println("Благоприятные ли условия для роста бобовых? Ответ: $isGoodForGrowth")
}