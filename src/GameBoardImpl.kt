class GameBoardImpl (answer: GameAnswer) {
    var guesses = mutableListOf<GameGuess>()
    val guessLimit = 12

    fun addGuess(guess: GameGuess) {

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
}