const val WEATHER_GOOD: Boolean = true
const val TENT_YES: Boolean = true
const val FAVORABLE_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val sunnyWeather: Boolean = true
    val tentAvailable: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"

    val isGoodForGrowth: Boolean = sunnyWeather == WEATHER_GOOD && tentAvailable == TENT_YES && humidity == FAVORABLE_HUMIDITY && season != UNFAVORABLE_SEASON
    println("Благоприятные ли условия для роста бобовых? Ответ: $isGoodForGrowth")
}
