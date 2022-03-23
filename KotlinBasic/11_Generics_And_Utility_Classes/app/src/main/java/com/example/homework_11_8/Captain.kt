import kotlin.random.Random

class Captain() : AbstractWarrior() {

    override val maxHealthLevel: Int = Random.nextInt(80, 90)

    override val accuracy: Int = Random.nextInt(50, 80)

    override val weapon: AbstractWeapon = when (Random.nextInt(3)) {
        0 -> Weapons.createMachineGun()
        1 -> Weapons.createAssaultGun()
        else -> Weapons.createRifle()
    }

    override var currentHealthLevel: Int = maxHealthLevel

    override var chanceToAvoid: Int = Random.nextInt(50, 70)
    override fun toString(): String {
        return "Captain(maxHealthLevel=$maxHealthLevel, accuracy=$accuracy, weapon=${weapon.fireType}, currentHealthLevel=$currentHealthLevel, chanceToAvoid=$chanceToAvoid)"
    }


}