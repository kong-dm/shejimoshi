package com.design.daili.dongtai.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类（执行者）
 * @author kdm
 * @date 2019/8/6 17:39
 */
public class SglentProxy implements MethodInterceptor {

    private Sglent sglent;
    public SglentProxy(Sglent sglent){
        this.sglent=sglent;
    }
    public Sglent proxy(){
        //1.创建cglib的核心类对象
        Enhancer enhancer=new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(sglent.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.创建代理对象
        Sglent slt= (Sglent) enhancer.create();
        return slt;
    }





    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预处理：----洗葡萄");
        Object object =  methodProxy.invokeSuper(o,objects);
         System.out.println("后处理：-----吐葡萄");
         return object;
    }
}
