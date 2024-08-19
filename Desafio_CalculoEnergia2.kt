fun main() {
    fun calculaEnergiaConsumo(valorConsumoEletricidade:Double,valorConsumoGasNatural:Double){

        var calculoEletricidadeCarbono = valorConsumoEletricidade * 0.475
        var calculoGasNaturalCarbono = valorConsumoGasNatural * 2.0
        var totalEnergias = calculoEletricidadeCarbono + calculoGasNaturalCarbono

        println(" Cálculo de emissão de Eletricidade ${calculoEletricidadeCarbono}")
        println(" Cálculo de emissão de Gás Natural ${calculoGasNaturalCarbono}")
        println(" Total Energias ${totalEnergias}")

    }

    println(" Cálculo de emissão de Carbono Desafio")
    println(" Informe o valor de consumo de Eletricidade")
    var valorConsumoEletricidade = readln().toDouble()
    println(" Informe o valor de consumo de gás Natural")
    var valorConsumoGasNatural = readln().toDouble()
    calculaEnergiaConsumo(valorConsumoEletricidade,valorConsumoGasNatural)

}