open class GameAnswer(
    private var one: GamePeg,
    private var two: GamePeg,
    private var three: GamePeg,
    private var four: GamePeg
) {
    override fun toString(): String = "$one$two$three$four"
}