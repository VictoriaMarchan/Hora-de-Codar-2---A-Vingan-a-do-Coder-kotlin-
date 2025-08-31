fun main(){
    print("Digite sua altura em metros: ")
    val altura = readLine()!!.toDouble()
    print("Digite o genero (1 = Feminino, 2 = masculino): ")
    val genero = readLine()!!.toInt()

    val pesoIdeal = when(genero) {
        1 -> (62.1 * altura) - 44.7
        2 -> (72.7 * altura) - 58
        else -> null
    }

    if (pesoIdeal != null){
        println("Seu peso ideal é: %2f kg".format(pesoIdeal))
    } else {
        println("Opção de genero inválida.")
    }
}