fun main () {
    var weight = 20
    var volume = 80
    val comparisonResult1: Boolean = (lowerWeight <= weight) && (weight <= upperWeight) && (volume >= averageVolume)
    if (comparisonResult1 == true) {
        println("Это средний груз")
    } else {
        println("Это не средний груз")
    }
    weight = 50
    volume = 100
    val comparisonResult2: Boolean = (lowerWeight <= weight) && (weight <= upperWeight) && (volume >= averageVolume)
    if (comparisonResult2 == true) {
        println("Это средний груз")
    } else {
        println("Это не средний груз")
    }
}
const val lowerWeight = 35
const val upperWeight = 100
const val averageVolume = 100