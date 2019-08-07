package com.design.yuanxing;


/**
 * 深拷贝:两种对象互为独立，属于单独对象
 * @author kdm
 * @date 2019/8/7 7:42
 */
public class Shape implements Cloneable{
    private String name;
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
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
    @Override
    public Shape clone(){
        try{
            Shape person = (Shape) super.clone();
            return person;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
