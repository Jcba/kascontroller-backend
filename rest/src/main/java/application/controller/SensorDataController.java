package application.controller;

import application.model.Temperature;
import application.service.api.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorDataController {

    private final SensorService sensorService;

    @Autowired
    public SensorDataController(final SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @RequestMapping(value = "/temperature", method = RequestMethod.GET)
    public List<Temperature> getTemperatureData() {
        return sensorService.getTemperatureData();
    }

}
