package Classes

class Moto: Carro() {
    fun teste(){
        this.nome
        this.modelo
    }

    override fun ligar(){
        println("Essa função foi sobreposta!")
    }

}