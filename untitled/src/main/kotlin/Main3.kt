fun main(args: Array<String>) {

    print("Введите четырёхзначное число: ")
    val input = readLine()

    if (input != null && input.length == 4 && input.all { it.isDigit() }) {
        val digits = input.map { it.toString().toInt() }
        println("Цифры числа: ${digits.joinToString(", ")}")
    } else {
        println("Ошибка: введите корректное четырёхзначное число.")
    }
}