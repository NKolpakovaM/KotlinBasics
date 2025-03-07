fun main() {
    val day = 5
    val legsAndBack = day % 2 == 0
    println(
        """
        упражнения для рук: ${!legsAndBack}
        упражнения для ног: ${legsAndBack}
        упражнения для спины: ${legsAndBack}
        упражнения для пресса: ${!legsAndBack}
        """.trimIndent()
    )
}
