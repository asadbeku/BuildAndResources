import kotlin.random.Random

class Team(
    count: Int = 0
) {
    var countOfWarriors = count

    val warriors = mutableListOf<AbstractWarrior>()

    init {
        // создаем каждого война в завиммости от вероятности (слабый по рангу войн создается с большей вороятностью)
        if (countOfWarriors > 0) {
            for (i in 0 until countOfWarriors) {
                when (Random.nextInt(101)) {
                    in 0..10 -> warriors.add(General())
                    in 11..50 -> warriors.add(Captain())
                    else -> warriors.add(Soldier())
                }
            }
        }
        // заряжаем оружия у войнов
        warriors.forEach {
            it.weapon.changeMagazine()
        }
    }

    // функция печати команды
    fun printTeam() {
        warriors.forEach {
            it.printWarrior()
        }
    }
}