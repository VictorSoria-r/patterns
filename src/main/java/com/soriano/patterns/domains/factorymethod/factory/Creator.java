package com.soriano.patterns.domains.factorymethod.factory;

import com.soriano.patterns.domains.factorymethod.models.Product;

public abstract class Creator {

     public abstract Product createProduct();

     public void someOperation() {
         Product product = createProduct();
         product.doStuff();
     }
}
