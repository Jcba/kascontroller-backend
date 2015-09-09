package application.service.impl;

import application.model.Temperature;
import application.model.TemperatureType;
import application.service.api.SensorService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SensorServiceBean implements SensorService {

    @Override
    public List<Temperature> getTemperatureData() {
        final ArrayList<Temperature> temperatures = new ArrayList<>();
        temperatures.add(new Temperature(BigDecimal.valueOf(12.0), TemperatureType.CELCIUS, new Date()));
        return temperatures;
    }
}
