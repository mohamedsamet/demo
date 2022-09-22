package com.clean.demo.design.pattern.abstractfac.service;

import com.clean.demo.design.pattern.abstractfac.creator.OSFactory;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    public String getEntity(String entity, OSFactory osFactory) {
        if (entity.equals("btn")) {
            return osFactory.createButton().paintBtn();
        }
        return osFactory.createInput().paintInput();
    }
}
