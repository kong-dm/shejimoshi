package com.design.daili.dongtai.jdkproxy;


/**
 * @author kdm
 * @date 2019/8/6 17:17
 */
public class ProxyTest {
    public static void main(String[] args) {
         User user = new UserImpl();
         User proxy=new UserProxy(user).proxy();
         proxy.eat("苹果");
     }
    }

