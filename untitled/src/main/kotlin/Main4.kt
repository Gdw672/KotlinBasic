fun main(args: Array<String>) {

    val totalDays = 2642

    val years = totalDays / 365
    val remainingDaysAfterYears = totalDays % 365

    val weeks = remainingDaysAfterYears / 7
    val days = remainingDaysAfterYears % 7

    println("В $totalDays днях:")
    println("$years лет")
    println("$weeks недель")
    println("$days дней")
}