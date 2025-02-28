fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / (60 * 60)
    val remainingSeconds = totalSeconds % (60 * 60)
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Gagarin space time was $formattedTime")

}
