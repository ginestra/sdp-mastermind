package test

import GamePeg
import org.junit.Assert.*

class GamePegTest {
    @org.junit.Test
    fun execute() {
        val peg = GamePeg("Y")

        assertEquals(peg.toString(), "Y")
    }
}