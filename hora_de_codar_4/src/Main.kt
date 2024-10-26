fun main() {
    val estudantes = mutableListOf<String>()
    var nome: String

    do {
        print("Digite o nome do estudante (ou 'PARE' para encerrar): ")
        nome = readLine()!!.toString()

        if (nome != "PARE") {
            estudantes.add(nome)
        }
    } while (nome != "PARE")

    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")
    estudantes.forEach { println(it) }
}