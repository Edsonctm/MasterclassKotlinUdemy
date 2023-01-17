fun main(){
    test(arrayListOf(2,3,5,6,87,3,6,8,8,4,2,4,7,2,56,78,5,433,2))
}

fun test(n: ArrayList<Int>){
    val alterN = n.map {
        if (it % 2 == 0){
            it * 2
        } else {
            it / 2
        }
    }
    println(alterN.filter { it > 25 })
}



//fun y(n: ArrayList<String>){
//    println(n.sortedByDescending { it.length - 1 })
//}



//fun x(vararg n: Int){
//    println(n.filter { it in 10..99 })
//}

//fun mensagem(nome: String){
//    println("Olá $nome!")
//}
//
//val lambda = {nome: String -> println("Olá $nome!")}









//fun tamanho(s: String): Int{
//    return s.length
//}
//
//fun tamanho(n: Int): String{
//    var retorno = ""
//    for (i in 0 .. n){
//        retorno += "a"
//    }
//
//    return retorno
//}




//fun teste(n: String): String{
//    return n
//}
//
//fun teste(n: Int): Int{
//    return n
//}
//
//fun teste(n: Int?): Int{
//    return n!!
//}



//fun lifespan(pet: String){
//    var expectation = 0
//    when (pet){
//        "cat" -> expectation = 15
//        "dog" -> expectation = 10
//        "rabbit" -> expectation = 12
//        else -> expectation = 20
//    }
//
//    println("The lifespan estimated for a $pet is $expectation years!")
//}



//fun ehPar(n: Int): Boolean{
//    if (n % 2 == 0) return true
//    return false
//}