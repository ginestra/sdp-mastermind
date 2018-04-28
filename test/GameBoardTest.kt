
import org.junit.Test
import kotlin.test.assertEquals

class GameBoardTest {

    @Test
    fun returnObjectTest() {
        var new = GameAnswer(GamePeg("A"), GamePeg("B"), GamePeg("C"), GamePeg("D"))
        var myObject = GameBoardImpl(new)
        assertEquals(new, myObject.getAnswer())
    }
}