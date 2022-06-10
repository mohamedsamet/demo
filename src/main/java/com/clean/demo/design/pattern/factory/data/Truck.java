package com.clean.demo.design.pattern.factory.data;

import com.clean.demo.design.pattern.factory.model.Vehicule;

public class Truck implements Vehicule {

    @Override
    public String goAhead() {
        return "Truck going ahead";
    }

    @Override
    public String stop() {
        return "Truck stopping";
    }

    @Override
    public Long getSpeed() {
        return 50L;
    }
}
