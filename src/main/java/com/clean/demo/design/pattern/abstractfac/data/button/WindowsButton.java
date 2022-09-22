package com.clean.demo.design.pattern.abstractfac.data.button;

import com.clean.demo.design.pattern.abstractfac.model.Button;

public class WindowsButton implements Button {

    @Override
    public String paintBtn() {
        return "Windows Button";
    }
}
