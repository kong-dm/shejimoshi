package com.design.daili.dongtai.cglib;

/**
 * @author kdm
 * @date 2019/8/6 17:44
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sglent  sglent=new Sglent();
        Sglent dao=new SglentProxy(sglent).proxy();
        dao.save("葡萄");
    }
}
