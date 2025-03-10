fun main() {
    val crystalOre = 7.0
    val ironOre = 11.0
    val buffShare = 20.0
    val percentage = 100
    val crystalBonus = (crystalOre * (buffShare / percentage)).toInt()
    val ironBonus = (ironOre * (buffShare / percentage)).toInt()
    println("Бонусная кристаллическая руда: $crystalBonus")
    println("Бонусная железная руда: $ironBonus")
}