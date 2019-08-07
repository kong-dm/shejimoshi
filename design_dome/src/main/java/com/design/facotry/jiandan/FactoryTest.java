package com.design.facotry.jiandan;

import java.util.LinkedList;

/**
 * @author kdm
 * @date 2019/8/4 16:37
 */
public class FactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
       // Factory factory= carFactory.getFactoryCar("BIM1");
        Factory factory= carFactory.getFactoryCar("dazhong");
        factory.factoryCar();


    }
}
