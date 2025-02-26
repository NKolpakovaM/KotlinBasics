import kotlin.math.pow
fun main() {
    val sumStart = 70000.000
    val interestRate = 16.7
    val time = 20.0
    var sumFinal = sumStart * Math.pow(1 + interestRate / 100.0, time)
    print ("Размер вклада через 20 лет: ")
    print ("%.3f".format(sumFinal))
}