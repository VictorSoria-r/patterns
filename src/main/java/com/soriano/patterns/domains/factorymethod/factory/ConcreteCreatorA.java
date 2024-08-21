package com.soriano.patterns.domains.factorymethod.factory;

import com.soriano.patterns.domains.factorymethod.models.Product;
import com.soriano.patterns.domains.factorymethod.models.impl.ConcreteProductA;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
