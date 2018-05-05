import java.util.Random
fun generateGameAnswer() : GameAnswer {
    return GameAnswer(
        getRandomGamePeg(),
        getRandomGamePeg(),
        getRandomGamePeg(),
        getRandomGamePeg()
    )
}

// function to generate Random number
fun getRandomGamePeg(): GamePeg {
    val gamePegs = GamePeg.values()

    return gamePegs[Random().nextInt((gamePegs.size - 0))]
}