package Classes

import java.util.*

open class Carro {
    var modelo: String? = null
    var velocidadeMaxima: Int = 0

    init {
        println("Modelo $modelo velocidade máxima $velocidadeMaxima!")
    }


    open fun ligar() {
        println("O carro $modelo foi ligado!")
    }

    fun dirigir(velocidade: Int){
        println("Dirigindo a $velocidade km/h!")
    }
}