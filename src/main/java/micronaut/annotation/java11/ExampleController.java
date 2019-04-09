package micronaut.annotation.java11;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Controller
@Validated
public class ExampleController {

    @Get("/{?b}")
    public String handle(@Min(1) @Max(20) int b) {
        return "ok";
    }

}
