//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Digite o primeiro número:")
    val numerador = readLine()?.toDoubleOrNull() ?: 0.0
    var denominador = 0.0

    do {
        println("Digite o segundo número (positivo):")
        // Lê a entrada do usuário e converte para double
        denominador = readLine()?.toDoubleOrNull() ?: 0.0
    } while (denominador <= 0)


    val resultado = numerador / denominador
    println("O resultado da divisão é: $resultado")
}