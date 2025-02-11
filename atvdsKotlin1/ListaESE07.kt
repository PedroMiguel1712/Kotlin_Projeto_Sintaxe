fun main() {
    println("Digite o tamanho do lado do quadradado : ")
    val quadrado = readLine()!!.toInt()
    val area = (quadrado * quadrado)
    println("Sua área é: $area")
    val area2 = area * 2
    println("O dobro da sua área é: $area2")
}