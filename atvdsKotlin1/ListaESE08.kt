fun main() {
    println("Quanto você ganha por hora: ")
    val hora = readLine()!!.toInt()
    println("Quantas horas trabalha por mês: ")
    val mes = readLine()!!.toInt()
    val total = mes * hora
    println("Você ganha por mês: $total")
}