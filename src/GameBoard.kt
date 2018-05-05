interface GameBoard {

    /**
     * Holds the GameAnswer for the GameBoard.
     */
    var answer : GameAnswer

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
    fun addGuess(guess: GameGuess)

    /**
     * Checks if any of the guesses match the answer.
     */
    fun isSolved() : Boolean

    /**
     * How many guesses remain.
     */
    fun getRemainingGuessCount() : Int

    /**
     * Clear the game board, removes answer and guesses.
     */
    fun resetBoard()

    /**
     * String representation of the entire board.
     */
    override fun toString() : String
}