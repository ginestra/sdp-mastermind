/**
 * GameBoard holds the overall state of the game.
 *
 * @property answer Holds the GameAnswer for the GameBoard.
 */
abstract class GameBoard (val answer: GameAnswer) {
    /**
     * Holds each of the GameGuess for the GameBoard.
     */
    protected abstract val guesses : MutableList<GameGuess>

    /**
     * Specifies the max number of guesses per game.
     */
    protected abstract val guessLimit : Int

    /**
     * Add a guess for the game board.
     */
    abstract fun addGuess(guess: GameGuess)

    /**
     * Checks if any of the guesses match the answer.
     */
    abstract fun isSolved() : Boolean

    /**
     * How many guesses remain.
     */
    abstract fun getRemainingGuessCount() : Int

    /**
     *  Get hint on how close the guess was to the answer.
     */
    abstract fun getGuessHint(guess: GameGuess) : String

    /**
     * String representation of the entire board.
     */
    abstract override fun toString() : String
}