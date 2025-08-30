fun main(){
    val valores = mutableListOf<Int>()
    for (i in 1..6) {
        print("Digite o valor $i: ")
        valores.add(readLine()!!.toInt())
    }
    val media = valores.average()
    println("Valores informados: $valores")
    println("Média aritmética: $media")
}
