package com.clean.demo.design.pattern.factory.data;

import com.clean.demo.design.pattern.factory.model.Vehicule;

public class Car implements Vehicule {

    @Override
    public String goAhead() {
        return "Car going ahead";
    }

    @Override
    public String stop() {
        return "Car stopping";
    }

    @Override
    public Long getSpeed() {
        return 90L;
    }
}
