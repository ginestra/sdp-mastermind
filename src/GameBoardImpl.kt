class GameBoardImpl (val answer: GameAnswer) {
    var guesses = mutableListOf<GameGuess>()
    val guessLimit = 12

    fun addGuess(guess: GameGuess) {
        guesses.add(guess)
    }

    fun isSolved() : Boolean {
        return false
    }
}