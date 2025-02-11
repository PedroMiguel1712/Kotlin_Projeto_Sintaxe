fun main() {
    println("Notas primeiro bi: ")
    val num1 = readLine()!!.toInt()
    println("Notas segundo bi: ")
    val num2 = readLine()!!.toInt()
    println("Notas terceiro bi: ")
    val num3 = readLine()!!.toInt()
    println("Notas quarto bi: ")
    val num4 = readLine()!!.toInt()
    val media = (num1 + num2 + num3 + num4)
    val result = (media / 4)
    println("A média é: $result")
}