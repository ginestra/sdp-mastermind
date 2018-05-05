package test

import GamePeg
import org.junit.Assert.*
import org.junit.Test

class GamePegTest {
    @Test
    fun validColourValues() {
        listOf("R", "G", "Y", "B").forEach {
            val peg = GamePeg.valueOf(it)
            assertEquals(peg.toString(), it)
        }
    }

    @Test
    fun invalidColourValue() {
        try {
            GamePeg.valueOf("X")
            fail("Expected an IllegalArgumentException to be thrown")
        } catch (exception: IllegalArgumentException) {}
    }
}

