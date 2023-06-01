package krystian.kryszczak.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import org.jetbrains.annotations.NotNull;

@Serdeable
@Introspected
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record Weather(
    @NotNull Location location,
    @NotNull WeatherDetails current
) {}
