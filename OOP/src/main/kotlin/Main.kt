import Classes.Calculadora
import Classes.Carro

fun main(args: Array<String>){
    val meuCarro = Carro()
    val calc = Calculadora()

    meuCarro.modelo = "BMW"

    calc.soma(5)
    calc.subtrai(2)
    calc.multiplica(10)
    calc.divide(3)
    calc.reseta()
}