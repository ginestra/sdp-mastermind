import org.junit.Assert
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class GameBoardImplTest {
    lateinit var gameBoard : GameBoardImpl

    @Before
    fun createGameBoard() {
        gameBoard = GameBoardImpl(generateGameAnswer())
    }

    @Test
    fun testRemainingGuesses() {
        assertEquals(12, gameBoard.getRemainingGuessCount())

        gameBoard.addGuess(GameGuess(GamePeg.Y, GamePeg.Y, GamePeg.Y, GamePeg.Y))
        assertEquals(11, gameBoard.getRemainingGuessCount())
    }

    @Test
    fun testGoingOverGuessLimit() {
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

    @Test
    fun testIsSolved() {
        val fakeSecretCode = GameAnswer(GamePeg.R, GamePeg.B, GamePeg.Y, GamePeg.Y)

        println(fakeSecretCode)

        // assertTrue(gameBoard.isSolved())
    }
}