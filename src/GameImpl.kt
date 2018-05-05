class GameImpl(showCode: Boolean) : GameAbstractImpl(showCode) {
    override fun runGames() {
        println("Welcome to Mastermind.\n" +
                "\n" +
                "This is a text version of the classic board game Mastermind.\n" +
                "The computer will think of a secret code.\n" +
                "The code consists of 4 colored pegs.\n" +
                "The pegs may be one of six colors: blue, green, orange, purple, red, or yellow.\n" +
                "A color may appear more than once in the code.\n" +
                "\n" +
                "You try to guess what colored pegs are in the code and what order they are in\n" +
                "After making a guess the result will be displayed.\n" +
                "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.\n" +
                "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n" +
                "\n" +
                "Only the first letter of the color is displayed. q1_2.B for Blue, R for Red, and so forth.\n" +
                "When entering guesses you only need to enter the first character of the color as a capital letter.\n" +
                "\n" +
                "You have 12 to guess the answer or you lose the game.\n" +
                "\n")

        var playing = true
        while (playing) {
            playing = startGame()
        }
    }

    fun startGame() : Boolean {
        println("Generating secret code ....\n")

        val answer = generateGameAnswer()
        val gameBoard = GameBoardImpl(answer)

        if (showCode) printSecretCode(answer.toString())

        while (gameBoard.getRemainingGuessCount() > 0) {
            println("You have ${gameBoard.getRemainingGuessCount()} guesses left.\n" +
                "\n" +
                "What is your next guess?\n" +
                "Type in the characters for your guess and press enter.")

            var validGuess = false;
            while (!validGuess) {
                print("Enter guess: ")

                try {
                    val input = readLine()!!

                    if (input.length == 4) {
                        gameBoard.addGuess(
                            GameGuess(
                                GamePeg.valueOf("${input[0]}"),
                                GamePeg.valueOf("${input[1]}"),
                                GamePeg.valueOf("${input[2]}"),
                                GamePeg.valueOf("${input[3]}")
                            )
                        )
                    }

                    validGuess = true;
                }  catch (exception: IllegalArgumentException) {}


            }

            if (gameBoard.isSolved()) break;

            if (showCode) printSecretCode(answer.toString())
            println(gameBoard.toString())
        }


        if (gameBoard.isSolved()) {
            println("You solved the puzzle! Good job.")
        } else {
            println("You did not solve the puzzle. Too bad.")
        }

        return promptForAnotherGame()
    }

    fun printSecretCode(answer: String) {
        println("The secret code is: $answer")
    }

    fun promptForAnotherGame() : Boolean {
        print("Enter Y for another game or anything else to quit: ")

        return (readLine() == "Y")
    }
}