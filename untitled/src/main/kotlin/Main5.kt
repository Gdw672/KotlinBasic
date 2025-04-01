fun main(args: Array<String>) {

    print("Введите число: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        val result: String = input.toString() + (input * 2).toString();
        println("Результат: $result")
    } else {
        println("Ошибка: введите корректное число.")
    }
}