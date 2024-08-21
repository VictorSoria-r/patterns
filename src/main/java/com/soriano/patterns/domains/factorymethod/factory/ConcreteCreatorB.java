package com.soriano.patterns.domains.factorymethod.factory;

import com.soriano.patterns.domains.factorymethod.models.Product;
import com.soriano.patterns.domains.factorymethod.models.impl.ConcreteProductB;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
