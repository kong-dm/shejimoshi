package com.design.daili.dongtai.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 代理类（执行者）
 * @author kdm
 * @date 2019/8/6 17:09
 */
public class UserProxy implements InvocationHandler {
     private User user;
     public UserProxy(User user){
         this.user=user;
     }
     public User proxy(){
        //参数一类的加载器  二实现的接口  三需要的对象
        User userProxy=(User) Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),this);
        return  userProxy;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("动态代理前置内容:校验身份信息");
        System.out.println("++++++++++++++++++++++++");
        method.invoke(user,objects);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("动态代理后置内容：记录日志");

       return null;
    }


}
