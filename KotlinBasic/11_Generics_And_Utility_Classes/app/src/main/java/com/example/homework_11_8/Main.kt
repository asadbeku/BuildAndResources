import kotlin.random.Random

fun main() {

    val battle = Battle(10)

    println("Первая команда:")
    battle.theFirstTeam.printTeam()

    println("Вторая команда:")
    battle.theSecondTeam.printTeam()

    var iter = 1
    while (!battle.isFinished) {
        println("    $iter-я итерация: ")
        battle.toMakeGameStep()
        printBattleState(battle.getBattleState())
        iter++
    }

}

// функция-расширение, возвращает значение true если случайное число в диапазоне от 0 до нашего Int будет равно нулю
fun Int.isACriticalDamage(): Boolean = Random.nextInt((100 / this)) == 0

// функция печати состания игры в зависимости от переданного состояния battleState
fun printBattleState(battleState: BattleState) {
    when (battleState) {
        is BattleState.Progress -> println("Состояние игры: КОМАНДА №1 - ${battleState.countOfFirstTeamWarriors} " +
                "| КОМАНДА №2 - ${battleState.countOfSecondTeamWarriors}")
        is BattleState.FirstTeamWin -> println("Состояние игры: КОМАНДА №1 - ПОБЕДА! " +
                "| КОМАНДА №2 - :-(")
        is BattleState.SecondTeamWin -> println("Состояние игры: КОМАНДА №1 - :-( " +
                "| КОМАНДА №2 - ПОБЕДА!")
    }
}
