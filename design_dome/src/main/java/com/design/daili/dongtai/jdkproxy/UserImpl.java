package com.design.daili.dongtai.jdkproxy;


/**
 * @author kdm
 * @date 2019/8/6 17:08
 */
public class UserImpl implements User {
    @Override
    public void eat(String s) {
        System.out.println("用户："+s+",登录成功");
    }
}
