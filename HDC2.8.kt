fun main() {
    val notas = mutableListOf<Double>()
    for (i in 1..4) {
        print("Digite a nota $i : ")
        val n = readLine()!!.toDouble()
        if (n in 0.0..10.0) {
            notas.add(n)
        } else {
            println("Nota inválida!")
        }
    }
    val media = notas.average()
    if (media > 5) {
        println("Voce passou no teste!")
    } else {
        println("Tente novamente.")
    }

}