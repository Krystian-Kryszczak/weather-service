package krystian.kryszczak.configuration;

import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class WeatherApiConfigurationTest {
    @Test
    void testWeatherApiConfiguration() {
        final Map<String, Object> items = new HashMap<>();
        items.put("weather-api.key", System.getenv("WEATHER_API_KEY"));

        ApplicationContext ctx = ApplicationContext.run(items);
        WeatherApiConfiguration weatherApiConfiguration = ctx.getBean(WeatherApiConfiguration.class);
        final String key = weatherApiConfiguration.getKey();

        assertNotNull(key);
        assertFalse(key.isBlank());
        assertEquals(31, key.length());

        ctx.close();
    }
}
