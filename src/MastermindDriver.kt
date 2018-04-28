object MastermindDriver {

    // Example - change as you need to...
    @JvmStatic
    fun main(args: Array<String>) {

        var g = Factory.getInstance(Game::class.java, true)
        g.runGames()
    }
}