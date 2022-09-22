package com.clean.demo.design.pattern.factory;

import com.clean.demo.design.pattern.factory.model.Vehicule;

public abstract class VehiculeFactory {

    public Vehicule generateVehicule() {
        return createVehicule();
    }

    public String goAhead() {
        Vehicule vehicule = generateVehicule();
        return vehicule.goAhead();
    }

    public String stop() {
        Vehicule vehicule = generateVehicule();
        return vehicule.stop();
    }

    public Long getSpeed() {
        Vehicule vehicule = generateVehicule();
        return vehicule.getSpeed();
    }

    protected abstract Vehicule createVehicule();
}
