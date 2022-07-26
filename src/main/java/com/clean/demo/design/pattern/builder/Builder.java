package com.clean.demo.design.pattern.builder;

import com.clean.demo.design.pattern.builder.models.CarType;
import com.clean.demo.design.pattern.builder.models.components.Engine;
import com.clean.demo.design.pattern.builder.models.components.GPSNavigator;
import com.clean.demo.design.pattern.builder.models.components.Transmission;
import com.clean.demo.design.pattern.builder.models.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
