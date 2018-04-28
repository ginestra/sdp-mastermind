typealias GameGuess = Any

class GameBoardImpl(answer:GameAnswer):GameBoard{
    val numOfGuesses = 12
    var guesses= mutableListOf<GameGuess>()
    var actualAnswer:GameAnswer
    var isGameSolved:Boolean = false

    init{
        actualAnswer = answer
    }

    override fun getAnswer(): GameAnswer {
        return actualAnswer
    }

    override fun addGuess(guess:GameGuess) {
        if (guess.toString().equals(actualAnswer)){

        }
        guesses.add(guess)
    }

    override fun isSolved(): Boolean {
        return isGameSolved
    }

    override fun getRemainingGuessCount(): Int {
        return (numOfGuesses - guesses.size)
    }

    override fun toString(): String {
        for (value in guesses){

        }
    }

}