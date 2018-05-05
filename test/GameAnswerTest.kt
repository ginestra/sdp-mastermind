
import org.junit.Test
import kotlin.test.assertEquals

class GameAnswerTest {

    @Test
    fun answerToString() {
        val answer = GameAnswer(
            GamePeg.valueOf("R"),
            GamePeg.valueOf("G"),
            GamePeg.valueOf("Y"),
            GamePeg.valueOf("B")
        )
        assertEquals(answer.toString(), "RGYB")
    }
}