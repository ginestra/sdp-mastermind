abstract class GameAbstractImpl(protected val showCode: Boolean) : Game
/**
 * Create a Game object.
 *
 * @param easy If easy is true the secret code will be
 * revealed at all times when playing the game. If easy is
 * false the secret code is not revealed until correctly guessed
 * or the player runs out of turns.
 */
