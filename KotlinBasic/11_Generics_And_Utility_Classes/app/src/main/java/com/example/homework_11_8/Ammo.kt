enum class Ammo(
    private val damage: Int,
    private val chanceOfCriticalDamage: Int,
    private val ratioOfCriticalDamage: Int
) {
    PISTOL_AMMO(10, 10, 1),
    RIFLE_AMO(50, 50, 1),
    ASSAULT_GUN_AMMO(20, 20, 3),
    MACHINE_GUN_AMMO(20, 15, 5);

    // функция получения критического урона
    fun getAmmoDamage(): Int = if (chanceOfCriticalDamage.isACriticalDamage()) damage * ratioOfCriticalDamage else 0
}
