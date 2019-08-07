package com.design.facotry.jiandan;

/**
 * 简单工厂（属于创建型模式）复杂工厂模式的思维模型
 * 比如：调用者需要一辆汽车，直接去找工厂，工厂生产的汽车类型有很多，只需把汽车的型号告诉工厂就可以了。
 * 场景：批量生产、标准化
 * @author kdm
 * @date 2019/8/4 16:23
 */
public interface Factory {
      void  factoryCar();
}
