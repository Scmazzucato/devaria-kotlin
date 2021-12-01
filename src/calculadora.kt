import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) {
    when (operador){
        "+" -> primeiroNumero + segundoNumero
        "-" -> primeiroNumero - segundoNumero
        "*" -> primeiroNumero * segundoNumero
        "/" -> primeiroNumero / segundoNumero
        "%" -> primeiroNumero % segundoNumero
    }
}
fun main() {
    println("Digite um Número Válido:")
    val primeiroNumero = readLine()?.toBigDecimal()
    if (primeiroNumero == null){
        println("O Número Informado Não é Válido")
        return
    }
    println("Digite um operador lógico válido:")
    val operador = readLine()
    if (operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador !="+" && operador !="-" && operador !="*" && operador !="/" && operador !="%")){
        println("Operador Inválido")
        return
    }
    println("Digite o Segundo Número:")
    val segundoNumero = readLine()?.toBigDecimal()
    if (segundoNumero == null){
        println("O Número Inforvado Não é Válido")
        return
    }
    val resultado = calculaOperacao(primeiroNumero, operador, segundoNumero)

    println("O resultado da conta foi: $resultado")
}