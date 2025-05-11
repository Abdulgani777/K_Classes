// Неизменяемые данные
data class Message(val username: String)

// Чистая функция (без побочных эффектов)
fun introduce(message: Message): String {
    return "Привет, меня зовут ${message.username}"
}

fun main() {
    val firstMessage = Message("Anton")
    println(introduce(firstMessage))  // Эффект вывода отделён от логики

    val secondMessage = Message("Pavel")
    println(introduce(secondMessage))

    println(introduce(Message("Alice")))
}