import kotlin.random.Random

class Soldier() : AbstractWarrior() {

    override val maxHealthLevel: Int = Random.nextInt(60, 80)

    override val accuracy: Int = Random.nextInt(20, 50)

    override val weapon: AbstractWeapon = when (Random.nextInt(4)) {
        0 -> Weapons.createMachineGun()
        1 -> Weapons.createAssaultGun()
        2 -> Weapons.createRifle()
        else -> Weapons.createPistol()
    }

    override var currentHealthLevel: Int = maxHealthLevel

    override var chanceToAvoid: Int = Random.nextInt(20, 50)
    override fun toString(): String {
        return "Soldier(maxHealthLevel=$maxHealthLevel, accuracy=$accuracy, weapon=$weapon, currentHealthLevel=$currentHealthLevel, chanceToAvoid=$chanceToAvoid)"
    }


}