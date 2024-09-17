class `Hora de codar- atividade 3`
fun main(){

    println("Digite um número:")
    var numero1= readln().toDouble()

    println("Digite um número:")
    var numero2= readln().toDouble()

    println("Digite um número:")
    var numero3= readln().toDouble()

    if(numero1>numero2 && numero1>numero3){
        println("O $numero1 é o maior") }
    else if (numero2>numero1 && numero2>numero3){
        println("O $numero2 é o maior") }

    else {
        println("O $numero3 é o maior") }
}
