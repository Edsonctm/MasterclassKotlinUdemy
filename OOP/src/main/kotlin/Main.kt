import Classes.Calculadora
import Classes.Carro
import Classes.Moto

fun main(args: Array<String>){
    val meuCarro = Carro("teste", 14)
    val minhaMoto = Moto()

    meuCarro.ligar()
    minhaMoto.ligar()
}