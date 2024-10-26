fun main() {
    val quantidadeDeNotas = 6
    var soma = 0.0

    for (i in 1..quantidadeDeNotas) {
        var nota: Double
        do {
            print("Digite a nota $i: ")
            nota = readLine()!!.toDouble()
        } while (nota < 0 || nota > 10)
        soma += nota
    }

    val media = soma / quantidadeDeNotas
    println("A média do aluno é: $media")
}