package com.soriano.patterns.domains.factorymethod.models.impl;

import com.soriano.patterns.domains.factorymethod.models.Product;

public class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("Se creo product B");
    }
}
