//Задача №1
fun main() {
    val amount = 1000
    val commission = 0.0075
    val minCommission = 35

    val totalCommission = amount * commission
    val result = if (totalCommission<minCommission) minCommission else totalCommission.toInt()
    println("Комиссия за перевод составит $result рублей")
}