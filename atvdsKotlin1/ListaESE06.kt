fun main() {
    println("Qual é o raio do circulo: ")
    val raio = readLine()!!.toInt()
    val area = (raio * raio) * 3.14
    println("Sua area é: $area")
}