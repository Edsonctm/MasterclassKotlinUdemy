import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun main() {
    println(jogo())
}

fun jogo(): ArrayList<String> {
    println("Bem-vindo ao jogo da forca.\nPor gentileza, informe qual o tema da palavra você deseja jogar:")
    println("1 - Animais \t 2 - Frutas\n3 - Música \t\t 4 - Objetos")
    val tema = readLine()!!.toInt()
    val animais = arrayListOf("Cachorro", "Gato", "Zebra", "Elefante", "Leão")
    val frutas = arrayListOf("Banana", "Caju", "Goiaba", "Cacau", "Pitaya")
    val musica = arrayListOf("Bateria", "Guitarra", "Baixo", "Rock", "Metal")
    val objetos = arrayListOf("Mesa", "Cadeira", "Computador", "Poltrona", "Cama")

    val palavrasJogo = when (tema){
                            1 -> animais
                            2 -> frutas
                            3 -> musica
                            else -> objetos
                        }
    val palavraJogo = palavrasJogo[Random.nextInt(1, palavrasJogo.size)]
    palavraJogo.forEach {
        print("_ ")
    }

    return palavrasJogo
}