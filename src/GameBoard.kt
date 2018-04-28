interface GameBoard {

    /**
     * Get the answer for the game board.
     */
    fun getAnswer() : GameAnswer

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
     * String representation of the entire board.
     */
    override fun toString() : String
}