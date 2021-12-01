fun main(argumentos: Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor Informar um argumento válido")
        return
    }
    val numero = argumentos[0].toIntOrNull()
    if(numero == null){
        println("O valor informado não é um número válido")
    }
    println("O número digitado foi: $numero")
    var soma = 0
    if (numero != null) {
        soma = numero * 2
    }
    println("A soma de numero + numero é de: ${soma}")
}
