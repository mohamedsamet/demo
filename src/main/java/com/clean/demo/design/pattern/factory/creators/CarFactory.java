package com.clean.demo.design.pattern.factory.creators;

import com.clean.demo.design.pattern.factory.VehiculeFactory;
import com.clean.demo.design.pattern.factory.data.Car;
import com.clean.demo.design.pattern.factory.model.Vehicule;

public class CarFactory extends VehiculeFactory {

    @Override
    protected Vehicule createVehicule() {
        return new Car();
    }
}
