fun main(){

    // Cálculo da área de um  retângulo

    println("Digite o tamanho da base do retângulo")
var base= readln().toDouble()

    println("Digite a altura do retângulo")
    var altura = readln().toDouble()

    var area= base*altura

    println("A área do retângulo é:$area")

//Cálculo da área de um quadrado

    println("Digite o comprimento do lado do quadrado")
    var lado= readln().toDouble()
    var areaQuadrado= lado*lado

    println("A área do quadrado é: $areaQuadrado")

    //Calcular a área de um Losango

    println("Digite a diagonal maior de um losango")
    var diagonalMaior= readln().toDouble()

    println("Digite a diagonal menor de um losango")
    var diagonalMenor= readln().toDouble()

    var areaLosango= (diagonalMaior*diagonalMenor)/2
    println("A área do Losango é:$areaLosango")


    //Calcular a área de um Trapézio

    println("Digite a base maior de um trapézio")
    var baseMaior= readln().toDouble()

    println("Digite a base menor de um trapézio")
    var baseMenor= readln().toDouble()

    println("Digite a altura de um trapézio")
    var alturaTrapezio= readln().toDouble()

    var areaTrapezio=(baseMaior+baseMenor)*alturaTrapezio/2
    println(" A área do trapézio é:$areaTrapezio")

//Calcular a área de um Paralelogramo

    println("Digite o tamanho da base de um Paralelograma")
    var baseParalelo= readln().toDouble()

    println("Digite a altura do Paralelograma")
    var alturaParalelo = readln().toDouble()

    var areaParelelo= baseParalelo*alturaParalelo

    println("A área do Paralelograma é:$areaParelelo")

    // Cálculo da área de um Triângulo

    println("Digite a base de um triângulo")
    var baseTriangulo= readln().toDouble()

    println("Digite a altura de um triângulo")
    var alturaTriangulo= readln().toDouble()

    var areaTriangulo=(baseTriangulo*alturaTriangulo)/2

    println("A área do troângulo é: $areaTriangulo")

    // Cálculo da área de un Círculo

    println("Digite o raio do círculo:")
    val raio = readln().toDouble()

    val areaCirculo = (raio * raio)* 3.14

    println("A área do círculo é: $areaCirculo")


}