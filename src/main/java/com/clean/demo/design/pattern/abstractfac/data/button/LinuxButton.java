package com.clean.demo.design.pattern.abstractfac.data.button;

import com.clean.demo.design.pattern.abstractfac.model.Button;

public class LinuxButton implements Button {

    @Override
    public String paintBtn() {
        return "Linux Button";
    }
}
