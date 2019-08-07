package com.design.daili.staticdome;

/**
 * 代理类
 *执行者
 * @author kdm
 * @date 2019/8/6 17:00
 */
public class JingTaiProxy implements JingTai{
    private JingTai jingTai=new JingTaiImpl();

    @Override
    public void eat(String s) {
        System.out.println("静态代理前置内容:校验身份信息");
        System.out.println("++++++++++++++++++++++++");
        jingTai.eat(s);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("静态代理后置内容：记录日志");
    }
}
