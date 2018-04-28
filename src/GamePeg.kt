class GamePeg {

    // GamePeg constructor

    enum class Colour(val colShortHand: String) {
        // blue, green, orange, purple, red, yellow
        Blue("B"), Green("G"), Orange("O"),
        Purple("P"), Red("R"), Yellow("Y")
    }

    // toString
    override fun toString() : String { return Colour.valueOf() }
//        Colour.valueOf("B") == Colour.Blue
//        Colour.valueOf("G") == Colour.Green
//        Colour.valueOf("O") == Colour.Orange
//        Colour.valueOf("P") == Colour.Purple
//        Colour.valueOf("R") == Colour.Red
//        Colour.valueOf("Y") == Colour.Yellow

        //Colour.values().toList())

}