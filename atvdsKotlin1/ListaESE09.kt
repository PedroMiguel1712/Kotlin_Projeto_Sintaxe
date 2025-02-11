fun main() {
    println("Temperatura em fahrenheit: ")
    val tempf = readLine()!!.toInt()
    val tempc = (tempf - 32) * 5/9
    println("Sua temperatura em celsius: $tempc")
}