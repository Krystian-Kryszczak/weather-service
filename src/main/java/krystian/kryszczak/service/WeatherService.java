package krystian.kryszczak.service;

import io.reactivex.rxjava3.core.Single;
import jakarta.inject.Singleton;
import krystian.kryszczak.configuration.WeatherApiConfiguration;
import krystian.kryszczak.http.WeatherApiClient;
import krystian.kryszczak.model.Weather;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Singleton
@RequiredArgsConstructor
public final class WeatherService {
    private final WeatherApiConfiguration configuration;
    private final WeatherApiClient client;

    public Single<Weather> getWeather(@NotNull String q, boolean aqi) {
        return client.getWeather(configuration.getKey(), q, aqi ? "yes" : "no");
    }
    public Single<Weather> getWeather(@NotNull String q) {
        return getWeather(q, false);
    }
}
