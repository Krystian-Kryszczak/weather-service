package krystian.kryszczak.endpoint;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.rxjava3.core.Single;
import krystian.kryszczak.model.Weather;
import krystian.kryszczak.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Controller
@RequiredArgsConstructor
public final class WeatherController {
    private final WeatherService weatherService;

    @Get
    @Secured(SecurityRule.IS_ANONYMOUS)
    public Single<Weather> weather(@QueryValue @NotNull String q) {
        return weatherService.getWeather(q);
    }
}
