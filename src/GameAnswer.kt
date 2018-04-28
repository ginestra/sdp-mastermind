
class GameAnswer(var o: GamePeg, var t: GamePeg, var th: GamePeg, var f: GamePeg){

    private lateinit var one: GamePeg
    private lateinit var two: GamePeg
    private lateinit var three: GamePeg
    private lateinit var four: GamePeg

    init{
        this.one = o
        this.two = t
        this.three = th
        this.three = f
    }

    override fun toString(): String{
        return (""+one+two+three+four)
    }

}