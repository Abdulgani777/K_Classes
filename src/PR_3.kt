sealed class Animal(
    open val food: String,
    open val location: String
) {
    abstract fun makeNoise(): String
    abstract fun eat(): String
    fun sleep() = "Животное спит"
}

data class Dog(
    override val food: String,
    override val location: String,
    val breed: String
) : Animal(food, location) {
    override fun makeNoise() = "Собака лает: Гав-гав!"
    override fun eat() = "Собака ест $food"
}

data class Cat(
    override val food: String,
    override val location: String,
    val lives: Int
) : Animal(food, location) {
    override fun makeNoise() = "Кошка мяукает: Мяу!"
    override fun eat() = "Кошка ест $food"
}

data class Horse(
    override val food: String,
    override val location: String,
    val maxSpeed: Double
) : Animal(food, location) {
    override fun makeNoise() = "Лошадь ржет: И-го-го!"
    override fun eat() = "Лошадь жует $food"
}

class Veterinarian {
    // Чистая функция (возвращает результат вместо вывода)
    fun treatAnimal(animal: Animal) = """
        Тип: ${animal::class.simpleName}
        Еда: ${animal.food}
        Место: ${animal.location}
        Звук: ${animal.makeNoise()}
        Процесс еды: ${animal.eat()}
    """.trimIndent()
}

fun main() {
    val animals = listOf(
        Dog("кости", "будка", "овчарка"),
        Cat("рыба", "дом", 9),
        Horse("сено", "поле", 60.5)
    )

    val vet = Veterinarian()

    animals.map(vet::treatAnimal)
        .forEach(::println)
}