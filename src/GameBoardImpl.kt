typealias GameGuess = Any

class GameBoardImpl(answer:GameAnswer):GameBoard{

    var actualAnswer:GameAnswer
    init{
        actualAnswer = answer
    }

    override fun getAnswer(): GameAnswer {
        return actualAnswer
    }

    override fun addGuess(guess:GameGuess) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSolved(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRemainingGuessCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resetBoard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}