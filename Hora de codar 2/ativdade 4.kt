class `Hora de codar2- atividade 4`
fun main (){

    var soma = 0.0

    println("Digite um número")
    var numero1= readln().toDouble()

    println("Digite um número")
    var numero2= readln().toDouble()

    println("Digite um número")
    var numero3= readln().toDouble()

    if(numero1>numero2 && numero3>numero2){
        soma = numero1 + numero3
        println("A soma dos dois maiores números é: $soma")

        else if (numero2>numero1 && numero3>numero1)
            soma=numero2+numero3

    }

}