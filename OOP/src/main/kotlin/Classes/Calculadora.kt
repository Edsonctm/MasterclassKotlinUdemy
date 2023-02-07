package Classes

class Calculadora {
    var total: Int = 0

    fun soma(valor: Int){
        total += valor
        println(total)
    }

    fun subtrai(valor: Int){
        total -= valor
        println(total)
    }

    fun multiplica(valor: Int){
        total *= valor
        println(total)
    }

    fun divide(valor: Int){
        total /= valor
        println(total)
    }

    fun reseta(){
        total = 0
        println(total)
    }
}