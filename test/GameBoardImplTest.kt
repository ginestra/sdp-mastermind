import org.junit.Test
import kotlin.test.assertEquals

class GameBoardImplTest {
    @Test

    fun testRemainingGuesses() {
        val gameBoard = GameBoardImpl(generateGameAnswer())
        assertEquals(12, gameBoard.getRemainingGuessCount())

    }


}