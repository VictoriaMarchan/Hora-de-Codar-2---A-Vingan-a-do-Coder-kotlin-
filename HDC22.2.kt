fun main () {
    print("Digite um número: ")
    val n = readLine()!!.toInt()

    when{
        n > 0 -> println("O número é positivo.")
        n < 0 -> println("O número é negativo.")
        else  -> println("O número é zero.")
    }
}