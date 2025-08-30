fun main(){
    val valores = mutableListOf<Int>()
    for (i in 1..4) {
        print("Digite o valor $i: ")
        valores.add(readLine()!!.toInt())
      }
    println("Primeíro valor: ${valores.first()}")
    println("Último valor: ${valores.last()}")
    println("Maior valor: ${valores.maxOrNull()}")

    }