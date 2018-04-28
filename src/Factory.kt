import com.github.salomonbrys.kodein.*

val kodein = Kodein {
    bind<Game>() with factory { showCode: Boolean -> GameImpl(showCode) }
}

object Factory {
    fun getInstance(c: Class<*>, b: Boolean?): Game = kodein.with(b).instance()
}
