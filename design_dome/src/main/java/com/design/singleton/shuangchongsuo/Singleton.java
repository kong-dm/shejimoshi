package com.design.singleton.shuangchongsuo;

/**
 * 单例模式 DCL 双重锁判断机制
 * @author kdm
 * @date 2019/8/6 16:34
 */
public class Singleton {

    private  volatile static Singleton singleton ;

    private Singleton(){}

    public static Singleton getInstance(){
      if(singleton==null){
          synchronized (Singleton.class){
              if(singleton==null){
                  singleton=new Singleton();
              }
          }
      }
      return singleton;
    }

}
