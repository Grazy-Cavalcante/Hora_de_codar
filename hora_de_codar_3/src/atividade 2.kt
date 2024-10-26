fun main() {
    var contador = 30
    while (contador >= 0) {
        println(contador)
        Thread.sleep(1000)
        contador--
    }
    println("EXPLOSÃO")
}