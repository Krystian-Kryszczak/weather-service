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
import org.jetbrains.annotations.Nullable;

@Controller
@RequiredArgsConstructor
@Secured(SecurityRule.IS_ANONYMOUS)
public final class WeatherController {
    private final WeatherService weatherService;

    @Get
    public Single<Weather> weather(@QueryValue @NotNull String q, @QueryValue @Nullable Boolean airQuality, @QueryValue @Nullable String lang) {
        return weatherService.getWeather(q, airQuality, lang);
    }
}
