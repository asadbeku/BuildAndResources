import kotlin.random.Random

class General() : AbstractWarrior() {

    override val maxHealthLevel: Int = Random.nextInt(90, 101)

    override val accuracy: Int = Random.nextInt(80, 101)

    override val weapon: AbstractWeapon = if (Random.nextInt(2) == 0) Weapons.createMachineGun()
    else Weapons.createAssaultGun()

    override var currentHealthLevel: Int = maxHealthLevel

    override var chanceToAvoid: Int = Random.nextInt(70, 101)

    override fun toString(): String {
        return "General(maxHealthLevel=$maxHealthLevel, accuracy=$accuracy, weapon=$weapon, currentHealthLevel=$currentHealthLevel, chanceToAvoid=$chanceToAvoid)"
    }


}