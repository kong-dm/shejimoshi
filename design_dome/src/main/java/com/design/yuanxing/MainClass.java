package com.design.yuanxing;

/**
 * @author kdm
 * @date 2019/8/7 7:36
 */
public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person ps = person.clone();
        System.out.println("-------浅拷贝---------");
        System.out.println("person:"+person);
        System.out.println("ps:"+ps);
        System.out.println("ps==person:"+(ps==person));
        System.out.println("===========================");
        System.out.println("-------深拷贝---------");
        Shape shape = new Shape();
        Shape se = shape.clone();
        System.out.println("shape:"+shape);
        System.out.println("se:"+se.toString());
        System.out.println("se==shape:"+(se==shape));
    }
}
