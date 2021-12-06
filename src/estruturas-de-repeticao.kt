fun main(args : Array<String>) {
    for(indice in args.indices){
        println("Percorrendo os argumentos, posição: $indice e valor ${args[indice]}")
    }
    for(indiceDecrescente in args.size-1 downTo 0){
        println("Percorrendo os argumentos de forma decrescente, posição: $indiceDecrescente e valor: ${args[indiceDecrescente]}")
    }
    for(args in args){
        println("Percorrendo os argumentos com for each valor: $args")
    }
    var contadorDeArgumentosLidos = 0
    while(contadorDeArgumentosLidos < args.size){
        println("Percorrendo os argumentos com while argumentos lidos: ${++contadorDeArgumentosLidos} valor lido: ${args[contadorDeArgumentosLidos-1]}")
    }
    var contadorLoopEfetuado = 0
    do{
        println("Percorrendo os argumentos com do while, total loops: $contadorLoopEfetuado" + " e valor lido: ${args[contadorLoopEfetuado]}")
        contadorLoopEfetuado++
    }while(contadorLoopEfetuado < args.size)
}