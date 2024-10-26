fun main() {
    print("Digite o primeiro número: ")
    val primeiroNumero = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val segundoNumero = readLine()!!.toInt()

    var soma = 0
    var quantidade = 0

    for (i in primeiroNumero..segundoNumero) {
        soma += i
        quantidade++
    }

    val media = soma.toDouble() / quantidade
    println("A média aritmética é: $media")
}