package com.design.facotry.chouxiang;

/**
 * @author kdm
 * @date 2019/8/4 16:37
 */
public class FactoryTest {

    public static void main(String[] args) {
       // Factory carFactory=new AudiFactory();
        Factory carFactory=new BIMFactory();
        carFactory.factoryCar();



    }
}
