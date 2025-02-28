fun main () {
    val day = 5
    val legsAndBack = day % 2 == 0
    val armsAndPress = !legsAndBack
    if (armsAndPress)
        println(
            """
            упражнения для рук: ${armsAndPress}
            упражнения для ног: ${legsAndBack}
            упражнения для спины: ${legsAndBack}
            упражнения для пресса: ${armsAndPress}
            """.trimIndent()
        )
    }

