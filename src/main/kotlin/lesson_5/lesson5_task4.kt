val LOGIN = "Zaphod"
val PASSWORD = "PanGalactic"

fun main() {
    println("Введите Ваш логин:")
    val loginInput = readln()

    if (loginInput != LOGIN) {
        println("Пользователь не зарегистрирован. Завершение работы.")
        return
    }

    println("Введите Ваш пароль:")
    val passwordInput = readln()

    if (passwordInput == PASSWORD) {
        println("Добро пожаловать в систему!")
    } else {
        println("Неверный пароль. Завершение работы.")
        return
    }
}
