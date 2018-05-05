class GameBoardImpl (val answer: GameAnswer) {
    private var guesses = mutableListOf<GameGuess>()
    private val guessLimit = 12

    fun addGuess(guess: GameGuess) {
        if (getRemainingGuessCount() < 1) throw Exception("You are out of guesses")
        guesses.add(guess)
    }

    fun isSolved() : Boolean {
        var answer = false
        for (a in guesses){
            if (a.toString().equals(answer.toString())){
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
