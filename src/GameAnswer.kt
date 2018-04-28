
class GameAnswer(GamePeg one, GamePeg two, GamePeg three, GamePeg four){
    var GamePeg one
    var GamePeg two
    var GamePeg three
    var GamePeg four
    init{
        this.one = one
        this.two = two
        this.three = three
        this.three = four
    }


    override fun toString(): String{
        return (one + two + three + four)
    }

}