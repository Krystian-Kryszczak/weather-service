package krystian.kryszczak.service;

import io.reactivex.rxjava3.core.Single;
import jakarta.inject.Singleton;
import krystian.kryszczak.configuration.WeatherApiConfiguration;
import krystian.kryszczak.http.WeatherApiClient;
import krystian.kryszczak.model.Weather;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@RequiredArgsConstructor
public final class WeatherService {
    private final WeatherApiConfiguration configuration;
    private final WeatherApiClient client;

    public Single<Weather> getWeather(@NotNull String q, @Nullable Boolean aqi) {
        return client.getWeather(configuration.getKey(), q, Boolean.TRUE.equals(aqi) ? "yes" : "no");
    }
}
