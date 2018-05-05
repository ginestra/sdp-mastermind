class GameBoardImpl (val answer: GameAnswer) {
    var guesses = mutableListOf<GameGuess>()
    val guessLimit = 12

    fun addGuess(guess: GameGuess) {
        guesses.add(guess)
    }

    fun isSolved() : Boolean {
        var answer = false
        for (a in guesses){
            val example: String = ""+ a.o.toString() + a.t.toString() + a.th.toString() + a.f.toString()
            if (example.equals(answer.toString())){
                answer = true
                break
            }
        }
        return answer
    }

    fun getRemainingGuessCount() : Int {
        return guessLimit - guesses.size;
    }

    override fun toString() : String {
        var str = "";

        guesses.forEach {
            val result = getGuessResult(it)
            str += "$it Result: $result\n"
        }

        // Print placeholders for remaining guesses
        repeat (getRemainingGuessCount()) { str += "...." }

        return str;
    }

    private fun getGuessResult(guess: GameGuess) : String {
        return "TODO!"
    }
}
