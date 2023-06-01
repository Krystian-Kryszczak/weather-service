package krystian.kryszczak.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties("weather-api")
public final class WeatherApiConfiguration {
    private String key;
}
