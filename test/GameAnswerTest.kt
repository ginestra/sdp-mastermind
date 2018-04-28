package test

import classes.*
import org.junit.Test
import kotlin.test.assertEquals

class GameAnswerTest {

    @Test
    fun execute() {
        var new = GameAnswer(GamePeg("A"), GamePeg("B"), GamePeg("C"), GamePeg("D"))
        assertEquals(new.toString(), "ABCD")
    }
//    @org.junit.Test
//    fun execute() {
//        assertTrue(true)
//    }
}