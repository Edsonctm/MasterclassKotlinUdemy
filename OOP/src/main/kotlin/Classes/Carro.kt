package Classes

open class Carro {
    var modelo: String? = null
    var velocidadeMaxima = 100

    open fun ligar() {
        println("O carro $modelo foi ligado!")
    }

    fun dirigir(velocidade: Int){
        println("Dirigindo a $velocidade km/h!")
    }
}