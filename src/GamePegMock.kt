data class GamePeg(val valuePassed: String){
    lateinit var value:String;
    init{
        value = valuePassed;
    }

    override fun toString(): String {
        return value
    }
}