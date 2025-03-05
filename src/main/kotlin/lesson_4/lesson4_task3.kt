fun main() {
    val sunnyWeather: Boolean = true
    val tentAvailable: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"

    val FAVORABLE_HUMIDITY = 20 // добавлена константа
    val UNFAVORABLE_SEASON = "winter" // добавлена константа
    val isGoodForGrowth: Boolean = sunnyWeather && tentAvailable && (humidity == FAVORABLE_HUMIDITY) && (season != UNFAVORABLE_SEASON)
    println("Благоприятные ли условия для роста бобовых? Ответ: $isGoodForGrowth")
}
