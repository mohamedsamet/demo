package com.clean.demo.design.pattern.abstractfac.creator;

import com.clean.demo.design.pattern.abstractfac.data.button.WindowsButton;
import com.clean.demo.design.pattern.abstractfac.data.input.WindowsInput;
import com.clean.demo.design.pattern.abstractfac.model.Button;
import com.clean.demo.design.pattern.abstractfac.model.Input;

public class WindowsFactory implements OSFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Input createInput() {
        return new WindowsInput();
    }
}
