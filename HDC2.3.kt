fun main(){

    var valor_1 : Int
    var valor_2 : Int
    var valor_3 : Int

    println("Digite o primeiro valor: ")
    valor_1 = readLine()!!.toInt()

    println("Digite o segundo valor: ")
    valor_2 = readLine()!!.toInt()

    println("Digite o terceiro valor: ")
    valor_3 = readLine()!!.toInt()

    if (valor_1 == valor_2 ||valor_1 == valor_3 || valor_2 == valor_3 ){

        println("Não digite valores iguais! ")


    }
    var maior_numero = maxOf(valor_1, valor_2, valor_3)
    println("O maior número é " + maior_numero)






}