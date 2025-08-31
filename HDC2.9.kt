import java.time.Year

fun main (){
    print("Digite o ano de nascimento: ")
    val anoNasc = readLine()!!.toInt()
    val anoAtual = Year.now().value
    val idade = anoAtual - anoNasc

    if (idade >= 18){
        println("Voce pode votar esse ano!")
    } else {
        println("Voce não pode votar esse ano!")
    }
}