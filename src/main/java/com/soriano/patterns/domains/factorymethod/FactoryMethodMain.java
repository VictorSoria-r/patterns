package com.soriano.patterns.domains.factorymethod;

import com.soriano.patterns.domains.factorymethod.factory.ConcreteCreatorA;
import com.soriano.patterns.domains.factorymethod.factory.ConcreteCreatorB;
import com.soriano.patterns.domains.factorymethod.factory.Creator;

import java.util.Scanner;

public class FactoryMethodMain {
    public static final String OPTION_A = "A";
    public static void run() {
        Creator creator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("what product do you want to create ? A or B");
        String option = scanner.next();
        if (option.equals(OPTION_A)) {
            creator = new ConcreteCreatorA();
        } else  {
            creator = new ConcreteCreatorB();
        }
        creator.someOperation();
    }
}
