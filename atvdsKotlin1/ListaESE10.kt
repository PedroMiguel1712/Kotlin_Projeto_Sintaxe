fun main() {
    println("Temperatura em celsius: ")
    val tempc = readLine()!!.toInt()
    val tempf = (tempc * 9/5) + 32
    println("Sua temperatura em fahrnheit: $tempf")
}