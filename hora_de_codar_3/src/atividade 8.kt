fun main() {
    var n: Int

    do {
        print("Digite um número inteiro positivo: ")
        n = readLine()!!.toInt()
        if (n <= 0) {
            println("Número inválido. Digite um número maior que zero.")
        }
    } while (n <= 0)

    for (i in 1..n) {
        println(i)
    }
}