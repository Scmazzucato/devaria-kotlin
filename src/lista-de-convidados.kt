fun main() {
    println("Favor Informar o Nome do Convidado:")
    val nome = readLine()
    if (nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome Informado Não á Válido!")
        return
    }
    println("Informa o Idade do Usuário:")
    val idade = readLine()?.toIntOrNull()
    if (idade == null || idade <= 0){
        println("Idade Informada Nâo é Válida!")
        return
    }
    var estaConvidado = false
    when(nome){
        "Samuel" -> estaConvidado = true
        "Catarina" -> estaConvidado = true
        "Giovane" -> estaConvidado = true
        "Osvaldo" -> estaConvidado = true
        "Flávia" -> estaConvidado = true
        else -> estaConvidado = false
    }
    if (estaConvidado && idade >= 18){
        println("Bem Vindo a Festa Kotlin Devaria 2021!")
    }else if(estaConvidado == false){
        println("Você Não Está Na Lista de Convidados!")
    }else{
        println("Você Não Tem 18 Anos Para Entrar na Festa!")
    }
}
