abstract class AbstractWeapon(val maxCountOfAmmo: Int) {
    var isEmpty = true
        protected set

    abstract val fireType: FireType

    private val ammoMagazine = Stack<Ammo>()

    abstract fun createOneAmmo(): Ammo

    // функция перезарядки магазина
    fun changeMagazine() {
        for (i in 0 until maxCountOfAmmo) ammoMagazine.push(createOneAmmo())
        isEmpty = false
    }

    // функция получения множетсва патронов List<Ammo>?
    fun getAmmo(): List<Ammo>? {
        if (ammoMagazine.isEmpty()) return null
        return when (fireType) {
            is FireType.SingleShot -> {
                val ammo = ammoMagazine.pop()
                if (ammoMagazine.isEmpty()) isEmpty = true
                return listOfNotNull(ammo)
            }
            is FireType.BurstShooting -> {
                var newAmmoList = emptyList<Ammo>()
                for (i in 0 until (fireType as FireType.BurstShooting).sizeOfBurst) {
                    newAmmoList = newAmmoList + ammoMagazine.pop()!!
                    if (ammoMagazine.isEmpty()) {
                        isEmpty = true
                        return newAmmoList
                    }
                }
                return newAmmoList
            }
            else -> {
                return null
            }
        }
    }

    override fun toString(): String {
        return "AbstractWeapon(maxCountOfAmmo=$maxCountOfAmmo, isEmpty=$isEmpty, fireType=${fireType.toString()}, ammoMagazine=$ammoMagazine)"
    }


}