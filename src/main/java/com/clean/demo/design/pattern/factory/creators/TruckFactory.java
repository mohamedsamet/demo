package com.clean.demo.design.pattern.factory.creators;

import com.clean.demo.design.pattern.factory.VehiculeFactory;
import com.clean.demo.design.pattern.factory.data.Truck;
import com.clean.demo.design.pattern.factory.model.Vehicule;

public class TruckFactory extends VehiculeFactory {

    @Override
    protected Vehicule createVehicule() {
        return new Truck();
    }
}
