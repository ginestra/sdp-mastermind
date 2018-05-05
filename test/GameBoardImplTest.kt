import org.junit.Assert
import org.junit.Test
import org.junit.Assert.*

class GameBoardImplTest {
    @Test

    fun testRemainingGuesses() {
        val gameBoard = GameBoardImpl(generateGameAnswer())
        assertEquals(12, gameBoard.getRemainingGuessCount())

        gameBoard.addGuess(GameGuess(GamePeg.Y, GamePeg.Y, GamePeg.Y, GamePeg.Y))
        assertEquals(11, gameBoard.getRemainingGuessCount())
    }

    @Test
    fun testGoingOverGuessLimit() {
        val gameBoard = GameBoardImpl(generateGameAnswer())
        assertEquals(12, gameBoard.getRemainingGuessCount())

        repeat(12) {
            gameBoard.addGuess(GameGuess(GamePeg.Y, GamePeg.Y, GamePeg.Y, GamePeg.Y))
        }

        assertEquals(0, gameBoard.getRemainingGuessCount())

        try {
            gameBoard.addGuess(GameGuess(GamePeg.Y, GamePeg.Y, GamePeg.Y, GamePeg.Y))
            fail("Expected an Exception to be thrown")
        } catch (exception: Exception) {}

        assertEquals(0, gameBoard.getRemainingGuessCount())
    }

}