fun main(){
    val valores = mutableListOf<Int>()
    for (i in 1..3){
        print("Digite o valor $i: ")
        valores.add(readLine()!!.toInt())
    }
    valores.sortDescending()
    println("A soma dois maiores valores é: ${valores[0] + valores[1]}")
}