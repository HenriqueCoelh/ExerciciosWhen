fun main(args: Array<String>) {
/*
Exercício 4

Criarem uma estrutura de when em que consigamos passar um número inteiro entre 1 e 12.
O programa precisará, então, retornar o mês referente ao número digitado
 */
    var num = 0

    println("Digite um número de 1 a 12: ")
    num = readLine()!!.toInt()

    when(num) {
        1 -> println("O número digitado é referente ao mês de Janeiro.")
        2 -> println("O número digitado é referente ao mês de Fevereiro.")
        3 -> println("O número digitado é referente ao mês de Março.")
        4 -> println("O número digitado é referente ao mês de Abril.")
        5 -> println("O número digitado é referente ao mês de Maio.")
        6 -> println("O número digitado é referente ao mês de Junho.")
        7 -> println("O número digitado é referente ao mês de Julho")
        8 -> println("O número digitado é referente ao mês de Agosto.")
        9 -> println("O número digitado é referente ao mês de Setembro.")
        10 -> println("O número digitado é referente ao mês de Outubro.")
        11 -> println("O número digitado é referente ao mês de Novembro.")
        12 -> println("O número digitado é referente ao mês de Dezembro.")
        else -> println("Número inválido")
    }

    }