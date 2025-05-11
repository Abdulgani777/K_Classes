// Чистые данные
data class Words(val message: String = "Класс Words был создан!")

// Функция для создания с логированием
fun createWords(): Pair<Words, String> {
    val words = Words()
    return words to words.message
}

fun main() {
    val (firstWord, message1) = createWords()
    println(message1)

    val (secondWord, message2) = createWords()
    println(message2)
}