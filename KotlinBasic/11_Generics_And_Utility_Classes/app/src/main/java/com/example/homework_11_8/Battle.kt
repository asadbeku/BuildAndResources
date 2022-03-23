import kotlin.random.Random

class Battle(countOfWarriors: Int = 0) {
    val theFirstTeam = Team(countOfWarriors)
    val theSecondTeam = Team(countOfWarriors)
    var isFinished: Boolean = countOfWarriors <= 0
        private set

    // функция возращает состояние битвы в зависмости от количества человек в каждой команде на данный момент
    fun getBattleState(): BattleState {
        if (theFirstTeam.countOfWarriors > 0 && theSecondTeam.countOfWarriors > 0)
            return BattleState.Progress(theFirstTeam.countOfWarriors, theSecondTeam.countOfWarriors)
        isFinished = true
        return if (theFirstTeam.countOfWarriors > 0 && theSecondTeam.countOfWarriors == 0)
            BattleState.FirstTeamWin
        else
            BattleState.SecondTeamWin
    }

    // функция реализации одного шага игры, возвращает true, если удалось сделать шаг, иначе false
    fun toMakeGameStep(): Boolean {
        if (theFirstTeam.countOfWarriors == 0 || theSecondTeam.countOfWarriors == 0) {
            isFinished = true
            return false
        }
        // перемешиваем списки войнов
        theFirstTeam.warriors.shuffle()
        theSecondTeam.warriors.shuffle()

        // каждый стреляет в свою пару, пара определяется индексом,
        // т.е. войн под индексом 0 из команды №1 стреляется с войном с таким же индексом из команды №2
        for (i in 0 until theFirstTeam.warriors.size) {
            // если кто-то в данной паре мертв, то выход, никаких действий не делаем
            if (theFirstTeam.warriors[i].isKilled || theSecondTeam.warriors[i].isKilled) continue
            // случайным образом определяем, кто первым в паре стреляет
            // первый стреляет во второго, если второй остается жив, то он стреляет в первого
            when (Random.nextInt(2)) {
                0 -> {
                    theFirstTeam.warriors[i].toAttack(theSecondTeam.warriors[i])
                    if (!theSecondTeam.warriors[i].isKilled) {
                        theSecondTeam.warriors[i].toAttack(theFirstTeam.warriors[i])
                        if (theFirstTeam.warriors[i].isKilled) theFirstTeam.countOfWarriors--
                    } else theSecondTeam.countOfWarriors--
                }
                1 -> {
                    theSecondTeam.warriors[i].toAttack(theFirstTeam.warriors[i])
                    if (!theFirstTeam.warriors[i].isKilled) {
                        theFirstTeam.warriors[i].toAttack(theSecondTeam.warriors[i])
                        if (theSecondTeam.warriors[i].isKilled) theSecondTeam.countOfWarriors--
                    } else theFirstTeam.countOfWarriors--
                }
            }
        }
        return true
    }
}