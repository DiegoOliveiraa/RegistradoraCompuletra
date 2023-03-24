class MaquinaDeTroco {
    private val caixa: MutableMap<Int, Int> = HashMap()

    fun abastecerCaixa(valor: Int, quantidade: Int) {
        if (caixa.containsKey(valor)) {
            caixa[valor] = caixa[valor]!! + quantidade
        } else {
            caixa[valor] = quantidade
        }
        println("Caixa abastecido com $quantidade moedas de $valor centavos.")
    }

    fun realizarSangria(valor: Int, quantidade: Int) {
        if (!caixa.containsKey(valor)) {
            println("Não há moedas de $valor centavos no caixa.")
            return
        }
        val saldo = caixa[valor]!! - quantidade
        if (saldo < 0) {
            println("Não é possível realizar a sangria. O caixa ficaria negativo.")
            return
        }
        caixa[valor] = saldo
        println("Sangria realizada com sucesso. $quantidade moedas de $valor centavos removidas do caixa.")
    }

    fun gerarTroco(valorCompra: Double, valorPago: Double) {
        var troco = ((valorPago - valorCompra) * 100).toInt()
        if (troco < 0) {
            println("O valor pago é insuficiente para cobrir o valor da compra.")
            return
        }

        val moedasTroco: MutableMap<Int, Int> = HashMap()
        for (valor in caixa.keys) {
            var quantidadeMoedas = troco / valor
            if (quantidadeMoedas > caixa[valor]!!) {
                quantidadeMoedas = caixa[valor]!!
            }
            troco -= quantidadeMoedas * valor
            moedasTroco[valor] = quantidadeMoedas
        }

        if (troco > 0) {
            println("Não é possível gerar o troco. Faltam moedas de $troco centavos.")
        } else {
            for (valor in moedasTroco.keys) {
                val quantidadeMoedas = moedasTroco[valor]!!
                if (quantidadeMoedas > 0) {
                    caixa[valor] = caixa[valor]!! - quantidadeMoedas
                    println("Foram utilizadas $quantidadeMoedas moedas de $valor centavos.")
                }
            }
        }
    }

    fun exibirCaixa() {
        if (caixa.isEmpty()) {
            println("O caixa está vazio.")
        } else {
            println("Moedas disponíveis no caixa:")
            for (valor in caixa.keys) {
                val quantidade = caixa[valor]!!
                println("$quantidade moedas de $valor centavos")
            }
        }
    }
}