package bug

import io.micronaut.core.annotation.Introspected
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/")
class MyController {
    @Post(consumes = [MediaType.APPLICATION_FORM_URLENCODED], produces = [MediaType.TEXT_PLAIN])
    fun test(@Body req: MyRequest) : String {
        return "test"
    }
}

@Introspected
data class MyRequest(
    val testId: String,
    val testSecret : String
)