fun main(args: Array<String>) {

    print("Введите ваше имя: ")
    val name = readLine()

    print("Введите ваш возраст: ")
    val age = readLine()?.toIntOrNull()

    if (name != null && age != null) {
        println("Привет, $name! Тебе уже $age.")
    } else {
        println("Ошибка: введите корректные данные.")
    }
}