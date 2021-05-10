package com.soriano.patterns.domains.factorymethod.models.impl;

import com.soriano.patterns.domains.factorymethod.models.Product;

public class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("Se creo product A");
    }
}
