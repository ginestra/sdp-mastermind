interface GameBoard {

    /**
     * Holds the GameAnswer for the GameBoard.
     */
    val answer : GameAnswer

    /**
     * Holds each of the GameGuess for the GameBoard.
     */
    var guesses : MutableList<GameGuess>

    /**
     * Specifies the max number of guesses per game.
     */
    val guessLimit : Int

    /**
     * Add a guess for the game board.
     */
    fun addGuess(guess: GameAnswer/*GameGuess*/)

    /**
     * Checks if any of the guesses match the answer.
     */
    fun isSolved() : Boolean

    /**
     * How many guesses remain.
     */
    fun getRemainingGuessCount() : Int

    /**
     * String representation of the entire board.
     */
    override fun toString() : String
}