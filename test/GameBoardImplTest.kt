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
    fun remainingGuesses() {
        assertEquals(12, gameBoard.getRemainingGuessCount())

        gameBoard.addGuess(GameGuess(GamePeg.Y, GamePeg.Y, GamePeg.Y, GamePeg.Y))
        assertEquals(11, gameBoard.getRemainingGuessCount())
    }

    @Test
    fun goingOverGuessLimit() {
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
    fun isSolved() {
        val answerStr = gameBoard.answer.toString();

        val correctGuess = GameGuess(
            GamePeg.valueOf("${answerStr[0]}"),
            GamePeg.valueOf("${answerStr[1]}"),
            GamePeg.valueOf("${answerStr[2]}"),
            GamePeg.valueOf("${answerStr[3]}")
        )

        assertFalse(gameBoard.isSolved())

        gameBoard.addGuess(correctGuess)

        assertTrue(gameBoard.isSolved())
    }

    @Test
    fun stringOutput() {
        val totalGuesses = gameBoard.getRemainingGuessCount()

        var expectedStr = ".... Secret Code\n";

        repeat(totalGuesses) { expectedStr += "....\n" }

        assertEquals(expectedStr, gameBoard.toString())
    }

    @Test
    fun getGuessHint() {
        val gameAnswer = GameAnswer(GamePeg.B, GamePeg.B, GamePeg.B, GamePeg.Y)
        val gameBoard = GameBoardImpl(gameAnswer)

        assertEquals("Black Black Black Black",
                gameBoard.getGuessHint(GameGuess(GamePeg.B, GamePeg.B, GamePeg.B, GamePeg.Y))
        )

        assertEquals("Black Black White White",
                gameBoard.getGuessHint(GameGuess(GamePeg.B, GamePeg.B, GamePeg.Y, GamePeg.B))
        )

        assertEquals("Black Black Black",
                gameBoard.getGuessHint(GameGuess(GamePeg.B, GamePeg.B, GamePeg.B, GamePeg.B))
        )

        assertEquals("Black White",
                gameBoard.getGuessHint(GameGuess(GamePeg.Y, GamePeg.B, GamePeg.R, GamePeg.R))
        )

        assertEquals("Black",
                gameBoard.getGuessHint(GameGuess(GamePeg.B, GamePeg.R, GamePeg.R, GamePeg.R))
        )

        assertEquals("White",
                gameBoard.getGuessHint(GameGuess(GamePeg.Y, GamePeg.R, GamePeg.R, GamePeg.R))
        )
    }
}
