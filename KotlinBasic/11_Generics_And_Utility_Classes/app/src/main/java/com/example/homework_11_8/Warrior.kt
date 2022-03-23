interface Warrior {
    var isKilled: Boolean
    var chanceToAvoid: Int

    fun toAttack(warrior: Warrior)
    fun toGetDamage(damage: Int)
}