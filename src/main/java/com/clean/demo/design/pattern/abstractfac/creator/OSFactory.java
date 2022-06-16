package com.clean.demo.design.pattern.abstractfac.creator;

import com.clean.demo.design.pattern.abstractfac.model.Button;
import com.clean.demo.design.pattern.abstractfac.model.Input;

public interface OSFactory {
    Button createButton();
    Input createInput();
}
