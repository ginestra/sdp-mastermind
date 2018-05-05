class GameBoardImpl (answer: GameAnswer) {
    var guesses = mutableListOf<GameGuess>()
    val guessLimit = 12

    fun addGuess(guess: GameGuess) {

    }

    fun isSolved() : Boolean {
        return false
    }
}