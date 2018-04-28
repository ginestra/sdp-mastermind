
import org.junit.Test
import kotlin.test.assertEquals

class GameAnswerTest {

    @Test
    fun toStringTest() {
        var new = GameAnswer(GamePeg("A"), GamePeg("B"), GamePeg("C"), GamePeg("D"))
        assertEquals(new.toString(), "ABCD")
    }
}