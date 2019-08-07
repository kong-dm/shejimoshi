package com.design.facotry.chouxiang;

/**
 *属于创建型模式：对于调用者来说，隐藏了复杂的逻辑处理过程，调用者只关心执行的结果
 * 对于工厂来说只对结果负责生产，保存生产出符合规范的产品
 * 比如：按种类划分生产汽车厂 ---按种类划分汽车产品店（宝马店，奥迪店，奔驰店等） ----调用者
 * 调用者需要一辆奥迪，找到对应汽车产品店，产品店拿到要求去找对应生产奥迪汽车的工厂进行生产。
 * 场景：流水线生产
 * 抽象汽车工厂类
 * @author kdm
 * @date 2019/8/4 16:51
 */
public abstract class Factory {
    abstract  void   factoryCar();
}
