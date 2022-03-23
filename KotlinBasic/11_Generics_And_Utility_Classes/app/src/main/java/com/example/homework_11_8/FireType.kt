import kotlin.random.Random

sealed class FireType() {
    object SingleShot : FireType()
    data class BurstShooting(private val maxSizeOfBurst: Int) : FireType() {
        val sizeOfBurst: Int
            get() = Random.nextInt(maxSizeOfBurst) + 1
    }



}
