fun main() {
    print("Digite um número inteiro positivo: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("Tabuada do $i")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
        println()
    }
}