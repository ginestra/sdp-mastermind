class GameBoardImpl (val answer: GameAnswer) {
    var guesses = mutableListOf<GameGuess>()
    val guessLimit = 12

    fun addGuess(guess: GameGuess) {
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
}