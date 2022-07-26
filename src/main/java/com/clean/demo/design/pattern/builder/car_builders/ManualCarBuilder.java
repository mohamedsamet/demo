package com.clean.demo.design.pattern.builder.car_builders;

import com.clean.demo.design.pattern.builder.Builder;
import com.clean.demo.design.pattern.builder.cars.ManualCar;
import com.clean.demo.design.pattern.builder.models.CarType;
import com.clean.demo.design.pattern.builder.models.components.Engine;
import com.clean.demo.design.pattern.builder.models.components.GPSNavigator;
import com.clean.demo.design.pattern.builder.models.components.Transmission;
import com.clean.demo.design.pattern.builder.models.components.TripComputer;

public class ManualCarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public ManualCar getResult() {
        return new ManualCar(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
