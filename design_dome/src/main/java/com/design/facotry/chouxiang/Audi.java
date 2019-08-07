package com.design.facotry.chouxiang;

/**
 * @author kdm
 * @date 2019/8/6 16:00
 */
public class Audi extends Car {

    @Override
    public Factory show() {
        return new AudiFactory();
    }
}
