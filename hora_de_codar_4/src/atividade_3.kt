fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Uva", "Morango", "Laranja")

    println("Lista de frutas disponíveis:")
    frutas.forEach { println(it) }

    while (frutas.isNotEmpty()) {
        print("Digite o nome da fruta a ser removida (ou 'sair' para encerrar): ")
        val frutaRemover = readLine()

        if (frutaRemover == "sair") {
            break
        }

        if (frutaRemover in frutas) {
            frutas.remove(frutaRemover)
            println("Fruta $frutaRemover foi retirada da lista.")
        } else {
            println("Fruta $frutaRemover indisponível no nosso mercado.")
        }

        println("Lista atualizada:")
        frutas.forEach { println(it) }
    }

    println("Lista de compras finalizada!")
}