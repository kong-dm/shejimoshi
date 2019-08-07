package com.design.daili.dongtai.jdkproxy;

/**
 * jdk代理
 * * 执行者、被代理人 对于被代理人来说，这件事情是一定要做的，但是我 自己又不想做或者没有时间做。
 * 对于代理人而言，需要获取到被代理的人个人资料， 只是参与整个过程的某个或几个环节。】
 * 场景：事务代理、非 侵入式日志监听 aop
 *
 * @author kdm
 * @date 2019/8/6 17:08
 */
public interface User {
    /**
     * 被代理对象
     * @param s
     */
    void eat(String s);
}
