package com.design.facotry.jiandan;

/**
 * @author kdm
 * @date 2019/8/4 16:28
 */
public class CarFactory {

    public Factory getFactoryCar(String name){
         if(name==null){
             return null;
          }
         if(name.equals("BIM")){
             return  new BIM();
          }
         if(name.equals("BaoMa")){
            return  new BIM();
         }
         if(name.equals("dazhong")){
             return  new DaZhong();
         }
          return new Factory() {
              @Override
              public void factoryCar() {
                  System.out.println("生产不了该汽车");
              }
          };
    }
}
