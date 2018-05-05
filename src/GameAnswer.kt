
open class GameAnswer(var o: GamePeg, var t: GamePeg, var th: GamePeg, var f: GamePeg){

    private var one: GamePeg
    private var two: GamePeg
    private var three: GamePeg
    private var four: GamePeg

    init{
        this.one = o
        this.two = t
        this.three = th
        this.four = f
    }

    override fun toString(): String{
        return (""+one+two+three+four)
    }

}