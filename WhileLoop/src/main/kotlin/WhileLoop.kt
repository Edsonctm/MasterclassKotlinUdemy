fun main (){

    val users = arrayListOf<String>()

   do {
       println("Digite seu usuário:")
       val user = readLine()?:""
       users.add(user)
    } while (users.indexOf(user) == -1)

}

//var index = 0
//
//do {
//    println(index)
//    index++
//} while (index < 10)

//println("Digite um número maior que 100:")
//val userNumber = readLine()?:""
//var index = 0
//val divisiveis = arrayListOf<Int>()
//
//while (index <= userNumber.toInt()){
//    if (index % 7 == 0) divisiveis.add(index)
//    index++
//}
//
//println("De 0 até $userNumber, os números divisíveis por 7 são $divisiveis!")

//var i = 5
//var j = 1
//while (i != 1) {
//    j *= i
//    i--
//}
//println(j)

//var i = 0
//while (i < 10){
//    println(i)
//    i++
//}