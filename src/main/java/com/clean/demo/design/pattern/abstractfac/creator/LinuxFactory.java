package com.clean.demo.design.pattern.abstractfac.creator;

import com.clean.demo.design.pattern.abstractfac.data.button.LinuxButton;
import com.clean.demo.design.pattern.abstractfac.data.input.LinuxInput;
import com.clean.demo.design.pattern.abstractfac.model.Button;
import com.clean.demo.design.pattern.abstractfac.model.Input;

public class LinuxFactory implements OSFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Input createInput() {
        return new LinuxInput();
    }
}
