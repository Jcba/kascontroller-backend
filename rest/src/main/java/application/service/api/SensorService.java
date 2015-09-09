package application.service.api;

import application.model.Temperature;

import java.util.List;

public interface SensorService {

    List<Temperature> getTemperatureData();

}
