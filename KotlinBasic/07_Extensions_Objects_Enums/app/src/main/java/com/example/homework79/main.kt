import Wallets.Companion.nationalwallet

fun main() {
    fun isNational(wallets: Wallets): Boolean {
        return wallets == nationalwallet
    }

    println(isNational(Wallets.RUB))
}