fun main(){
    
}

fun mensagem(nome: String){
    println("Olá $nome!")
}

val lambda = {nome: String -> println("Olá $nome!")}









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