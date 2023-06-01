package krystian.kryszczak.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Introspected
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record AirQuality(
    float co,
    float no2,
    float o3,
    float so2,
    float pm2_5,
    float pm10,
    int usEpaIndex,
    int gbDefraIndex
) {}
