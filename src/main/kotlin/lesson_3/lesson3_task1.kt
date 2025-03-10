import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    var userName: String? = null
    do {
        println("What is your name?")
        userName = readLine()
        if (userName.isNullOrBlank()) {
            println("Please, type your name")
        }
    } while (userName.isNullOrBlank())

    val currentHour = getFormattedHour().toInt()
    val greeting = if (currentHour in 1..17) {
        "Good day"
    } else {
        "Good evening"
    }
    println("$greeting, $userName!")
}

fun getFormattedHour(): String {
    val currentTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH")
    return currentTime.format(formatter)
}
