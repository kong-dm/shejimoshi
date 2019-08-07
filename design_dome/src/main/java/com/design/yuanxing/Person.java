package com.design.yuanxing;

/**
 * 原型模式（创建型模式）浅拷贝、深拷贝
 * 特点：首先有个原型
 * 数据内容相同，但对象实例不同（完全两个个体）
 * @author kdm
 * @date 2019/8/7 7:28
 */
public class Person implements Cloneable{
    /**
     * 浅拷贝
     */
    private  String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
