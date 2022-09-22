package com.clean.demo.design.pattern.abstractfac.data.input;

import com.clean.demo.design.pattern.abstractfac.model.Input;

public class LinuxInput implements Input {

    @Override
    public String paintInput() {
        return "Linux Input";
    }
}
