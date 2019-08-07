package com.design.facotry.chouxiang;

/**
 * 生产宝马汽车产品
 * @author kdm
 * @date 2019/8/6 16:06
 */
public class BIM extends Car{
    @Override
    public Factory show() {
        return  new BIMFactory();
    }
}
