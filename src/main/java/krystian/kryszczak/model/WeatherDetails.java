package krystian.kryszczak.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serdeable
@Introspected
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record WeatherDetails(
    int lastUpdatedEpoch,
    @NotNull String lastUpdated,
    float tempC,
    float tempF,
    int isDay,
    @NotNull Condition condition,
    float windMph,
    float windKph,
    int windDegree,
    @NotNull String windDir,
    float pressureMb,
    float pressureIn,
    float precipMm,
    float precipIn,
    int humidity,
    int cloud,
    float feelslikeC,
    float feelslikeF,
    float visKm,
    float visMiles,
    float uv,
    float gustMph,
    float gustKph,
    @Nullable AirQuality airQuality
) {}
