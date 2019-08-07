package com.design.daili.staticdome;

/**
 * 实现类
 * @author kdm
 * @date 2019/8/6 16:58
 */
public class JingTaiImpl implements JingTai {
    @Override
    public void eat(String s) {
        System.out.println("用户："+s+",登录成功");
    }
}
