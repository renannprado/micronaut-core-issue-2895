package bug

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("bug")
                .mainClass(Application.javaClass)
                .start()
    }
}