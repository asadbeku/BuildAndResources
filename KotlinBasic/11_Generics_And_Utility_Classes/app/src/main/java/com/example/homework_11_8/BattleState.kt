sealed class BattleState {
    object FirstTeamWin : BattleState()
    object SecondTeamWin : BattleState()
    class Progress(val countOfFirstTeamWarriors: Int, val countOfSecondTeamWarriors: Int) : BattleState()
}