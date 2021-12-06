fun main(args : Array<String>) {
    if (args.isEmpty()){
        println("Favor informar os produtos desejados")
        return
    }
    val produtosDisponiveis = arrayOf("pão", "queijo", "feijão", "carne", "frango", "refri", "suco", "arroz", "ovo")
    val produtosRequisitadosDisponiveis =  args.filter { produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado.toLowerCase()) }
    for (produtosRequisitadosDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nos temos: $produtosRequisitadosDisponivel")
    }
    val produtosRequisitadosNaoDisponiveis = args.filter { produtoRequisitado -> !produtosDisponiveis.contains(produtoRequisitado.toLowerCase()) }
    produtosRequisitadosNaoDisponiveis.forEach { produtoNaoDisponivel -> println("Este produto nós não temos: $produtoNaoDisponivel") }
    val produtosOrdenados = produtosDisponiveis.sortedBy { produto ->produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponivel: $produto") }
}
    