package application.controller;

import application.model.Temperature;
import application.model.TemperatureType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SensorDataController {

    @RequestMapping(value = "/temperature", method = RequestMethod.GET)
    public List<Temperature> getTemperatureData() {
        final ArrayList<Temperature> temperatures = new ArrayList<>();
        temperatures.add(new Temperature(BigDecimal.valueOf(12.0), TemperatureType.CELCIUS, new Date()));
        return temperatures;
    }


}
