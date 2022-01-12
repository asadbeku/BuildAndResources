enum class Wallets {
    EUR,
    RUB,
    USD,
    UZS;

    companion object {
        val nationalwallet = Wallets.EUR
    }

    val currencyConverter = object {
        val EUR = 0.884005
        val RUB = 73.901
        val UZS = 10776.3
    }

    fun convertToUSD(value: Double, wallets: Wallets): Double{
        return when(wallets) {
            RUB -> value * currencyConverter.RUB
            EUR -> value * currencyConverter.EUR
        }
    }
}