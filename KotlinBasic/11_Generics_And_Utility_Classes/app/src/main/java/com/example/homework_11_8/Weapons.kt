import kotlin.random.Random

object Weapons {
    // функция создания пистолета
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(8, 13)) {
            override val fireType: FireType
                get() = FireType.SingleShot

            override fun createOneAmmo(): Ammo = Ammo.PISTOL_AMMO
        }
    }

    // функция создания винтовки
    fun createRifle(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(6, 11)) {
            override val fireType: FireType
                get() = FireType.SingleShot

            override fun createOneAmmo(): Ammo = Ammo.RIFLE_AMO
        }
    }

    // функция создания штурмового оружия (автомата)
    fun createAssaultGun(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(3, 6) * 10) {
            override val fireType = FireType.BurstShooting(Random.nextInt(1, 11))

            override fun createOneAmmo(): Ammo = Ammo.ASSAULT_GUN_AMMO
        }
    }

    // функция создания пулемета
    fun createMachineGun(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(10, 21) * 10) {
            override val fireType = FireType.BurstShooting(Random.nextInt(10, 31))

            override fun createOneAmmo(): Ammo = Ammo.MACHINE_GUN_AMMO
        }
    }



}