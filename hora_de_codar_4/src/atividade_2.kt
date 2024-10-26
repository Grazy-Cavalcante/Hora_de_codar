fun main() {
    val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    var planetaProcurado: String?

    do {
        print("Digite o nome de um planeta (ou 'sair' para encerrar): ")
        planetaProcurado = readLine()

        if (planetaProcurado == "sair") break

        if (planetaProcurado in planetas) {
            println("O planeta $planetaProcurado está na lista!")
        } else {
            println("O planeta $planetaProcurado não foi encontrado. Tente novamente.")
        }
    } while (planetaProcurado != "sair")
}