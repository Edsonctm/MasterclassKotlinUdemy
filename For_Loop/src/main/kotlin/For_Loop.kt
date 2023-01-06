fun main() {
    val numero = readLine()?:""

    for (i in numero.toInt()downTo 1){
        val divisor = if(i % 7 == 0) "$i é divisível por 7" else null
        if (divisor != null) println(divisor)
    }
}

// tabela matriz
//for (i in 1..5){
//    for (j in 1..5){
//        print("[$j, $i] \t")
//    }
//    println()
//}

//for (i in 10.. 100 step 7){
//    println(i)
//}

//for (i in 1..12){
//    when(i){
//        1,3,5,7,8,10,12 -> println("31 dias")
//        2 -> {
//            if (ano.toInt() % 4 == 0){
//                println("29 dias")
//            } else {
//                println("28 dias")
//            }
//        }
//        else -> println("30 dias")
//    }
//}


//var index = 0
//for (i in 1..100){
//    index += i
//    println(index)
//}

//for (i in 1..3){
//    val mes = when(i){
//        1 -> "Janeiro"
//        2 -> "Fevereiro"
//        3 -> "Março"
//        else -> ""
//    }
//    println("O mês $i é $mes.")
//}


//val animais = arrayListOf("Gato", "Cachorro", "Peixe")
//
//for (animal in animais) {
//    println("Alimentar o $animal")
//}