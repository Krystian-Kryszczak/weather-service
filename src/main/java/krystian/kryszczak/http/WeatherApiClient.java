package krystian.kryszczak.http;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.rxjava3.core.Single;
import krystian.kryszczak.model.Weather;
import org.jetbrains.annotations.NotNull;

@Client(id = "weather-api")
public interface WeatherApiClient {
    @Get("/v1/current.json")
    Single<Weather> getWeather(@QueryValue @NotNull String key, @QueryValue @NotNull String q, @QueryValue @NotNull String aqi);
}
