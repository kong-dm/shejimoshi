package com.design.singleton.lanhan;

/**
 * 单例模式 懒汉模式 线程不安全
 * 特点：保证从系统启动到终止，全过程只会产生一个对象实例
 * 场景：配置文件，日历，ioc容器
 * 在判断对象为空是创建该对象
 * @author kdm
 * @date 2019/8/6 16:34
 */
public class Singleton {

    private static Singleton singleton ;

    private Singleton(){}

    public static Singleton getInstance(){
      if(singleton==null){
          singleton=new Singleton();
      }
      return singleton;
    }

}
