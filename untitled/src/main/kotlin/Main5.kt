fun main(args: Array<String>) {

    print("Введите число: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        val result = input + input * 2
        println("Результат: $result")
    } else {
        println("Ошибка: введите корректное число.")
    }
}