package com.design.singleton.ehanshi;

/**
 * 单例模式 饿汗模式 线程安全
 * @author kdm
 * @date 2019/8/6 16:34
 */
public class Singleton {

    private static Singleton sinstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return sinstance;
    }

}
