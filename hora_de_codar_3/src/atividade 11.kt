fun main() {
    val limiteInferior = 24
    val limiteSuperior = 42

    var dentroIntervalo = 0
    var foraIntervalo = 0

    for (i in 1..10) {
        print("Digite o valor $i: ")
        val valor = readLine()!!.toInt()

        if (valor in limiteInferior..limiteSuperior) {
            dentroIntervalo++
        } else {
            foraIntervalo++
        }
    }

    println("Quantidade de valores entre $limiteInferior e $limiteSuperior: $dentroIntervalo")
    println("Quantidade de valores fora do intervalo: $foraIntervalo")
}