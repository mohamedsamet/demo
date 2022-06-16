package com.clean.demo.design.pattern.abstractfac.data.input;

import com.clean.demo.design.pattern.abstractfac.model.Input;

public class WindowsInput implements Input {

    @Override
    public String paintInput() {
        return "Windows Input";
    }
}
