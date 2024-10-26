fun main() {
    var quantidadeAprovados = 0

    do {
        print("Digite a primeira nota: ")
        val nota1 = readLine()!!.toDouble()

        print("Digite a segunda nota: ")
        val nota2 = readLine()!!.toDouble()

        val media = (nota1 + nota2) / 2

        println("A média do aluno é: $media")

        if (media >= 9.5) {
            println("O aluno está aprovado!")
            quantidadeAprovados++
        } else {
            println("O aluno está reprovado.")
        }

        print("Calcular a média de outro aluno? (S/N): ")
    } while (readLine()?.toUpperCase() == "S")

    println("Quantidade de alunos aprovados: $quantidadeAprovados")
}