fun main(){
    val valores = mutableListOf<Int>()
    for (i in 1..6) {
        print("Digite o valor $i: ")
        valores.add(readLine()!!.toInt())
    }
    val soma = valores.filter { it < 72 }.sum()
    println("Números informados: $valores")
    println("Soma dos valores menores que 72: $soma")
}