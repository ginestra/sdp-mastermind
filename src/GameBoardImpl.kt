class GameBoardImpl (val answer: GameAnswer) {
    private val guesses = mutableListOf<GameGuess>()
    private val guessLimit = 12

    fun addGuess(guess: GameGuess) {
        if (getRemainingGuessCount() < 1) throw Exception("You are out of guesses")
        guesses.add(guess)
    }

    fun isSolved() : Boolean {
        var answerResult = false
        for (a in guesses){
            if (a.toString().equals(answer.toString())){
                answerResult = true
                break
            }
        }
        return answerResult
    }

    fun getRemainingGuessCount() : Int {
        return guessLimit - guesses.size;
    }

    fun getGuessHint(guess: GameGuess) : String {
        val guessStr = guess.toString()
        val answerStr = answer.toString()

        var matches = 0
        var contains = 0
        var noMatch = mutableListOf<Int>()

        for (i in 0 until answerStr.length) {
            if (guessStr[i] == answerStr[i]) {
                matches++
            } else {
                noMatch.add(i)
            }
        }

        noMatch.forEach {
            val i = it
            noMatch.forEach {
                if (guessStr[i] == answerStr[it]) contains++
            }
        }

        var str = ""
        repeat(matches) { str += "Black " }
        repeat(contains) { str += "White " }
        return str.trimEnd()
    }

    override fun toString() : String {
        var str = "";

        guesses.forEach {
            val hint = getGuessHint(it)
            str += "$it Result: $hint\n"
        }

        // Print placeholders for remaining guesses
        repeat (getRemainingGuessCount()) { str += "....\n" }

        return str;
    }
}
