fun main() {
    print("Digite o primeíro número: ")
    val a = readLine()!!.toDouble()
    print("Digite o segundo número): ")
    val b = readLine()!!.toDouble()

    println("Escolha a operação: 1-Adição, 2-Subtração, 3-Divisão, 4-Multiplicação. ")
    val op = readLine()!!.toInt()

    val resultado = when (op) {
        1 -> a + b
        2 -> a - b
        3 -> if (b != 0.0) a / b else "Erro: divisão por zero:"
        4 -> a * b
        else -> "Opção inválida"
    }

    println("Resultado: $resultado")


}