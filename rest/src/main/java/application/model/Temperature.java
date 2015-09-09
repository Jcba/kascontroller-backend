package application.model;

import java.math.BigDecimal;
import java.util.Date;

public class Temperature {

    private final BigDecimal temperature;
    private final TemperatureType temperatureType;
    private final Date fromDate;

    public Temperature(BigDecimal temperature, TemperatureType temperatureType, Date fromDate) {
        this.temperature = temperature;
        this.temperatureType = temperatureType;
        this.fromDate = fromDate;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public TemperatureType getTemperatureType() {
        return temperatureType;
    }

    public Date getFromDate() {
        return fromDate;
    }
}
