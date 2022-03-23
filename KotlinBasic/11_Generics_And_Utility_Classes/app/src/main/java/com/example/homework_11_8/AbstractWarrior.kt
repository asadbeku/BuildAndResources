import kotlin.random.Random

abstract class AbstractWarrior : Warrior {
    abstract val maxHealthLevel: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealthLevel: Int


    override var isKilled: Boolean = false

    abstract override var chanceToAvoid: Int

    /* функция атаки война warrior
    * если магазин пуст - перезарядка и выход
    * получаем множество патронов ammo, для каждого патрона вычисляем урон с помощью getAmmoDamage()
    * суммируем урон в sumOfDamage, передаем урон в toGetDamage война warrior*/
    override fun toAttack(warrior: Warrior) {
        if (weapon.isEmpty) {
            weapon.changeMagazine()
            println("$this перезаряжает магазин")
            return
        }
        val ammo = weapon.getAmmo()
        var sumOfDamage = 0
        ammo?.forEach {
            if (Random.nextInt(100 / accuracy) == 0)
                if (Random.nextInt(100 / warrior.chanceToAvoid) == 0)
                    sumOfDamage += it.getAmmoDamage()
        }
        println("$warrior получил урон=$sumOfDamage от $this")
        warrior.toGetDamage(sumOfDamage)
    }

    // функция получения урона
    override fun toGetDamage(damage: Int) {
        currentHealthLevel -= damage
        if (currentHealthLevel <= 0) {
            isKilled = true
            currentHealthLevel = 0
        }
    }

    // функция печати война с его характеристиками
    fun printWarrior() {
        print(
            "${this} (health=${currentHealthLevel}/$maxHealthLevel, " +
                    "accuracy=$accuracy, chanceToAvoid=$chanceToAvoid)" +
                    " ${if (isKilled) "-убит" else ""}"
        )
        println(" with weapon (${weapon.javaClass.simpleName}, ${weapon.fireType}/${weapon.maxCountOfAmmo})")
    }
}