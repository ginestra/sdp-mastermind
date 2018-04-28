class GamePeg {

    enum class Colour(val colShortHand: String) {
        // blue, green, orange, purple, red, yellow
        Blue("B"), Green("G"), Orange("O"),
        Purple("P"), Red("R"), Yellow("Y")
    }

    // toString
    override fun toString() : String {
        enumValues<Colour>().forEach { println(it.colShortHand) }
        return ""
    }
}