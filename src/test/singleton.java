package test;

import javafx.scene.chart.PieChartBuilder;

import java.security.Signature;

//public class singleton {
    //1.饿汉模式，不加判断，照单全收
//    private singleton(){}
//    private  static singleton instance =new singleton();
//    public static  singleton getInstance(){
//        return instance;
//    }

    //2.懒汉模式
//    private singleton(){}
//    private static singleton instance==null;
//    public static singleton getInstance(){
//        if(instance==null){
//            instance =new singleton();
//        }
//        return instance;
//    }
    //3.线程安全的懒汉模式
//    private singleton(){}
//    private static singleton instance;
//    public synchronized  static  singleton getInstance(){
//        if(instance==null){
//            instance =new singleton();
//        }
//        return instance;
//    }
    //4.双重锁的单例模式，安全，且在多线程情况下高速运行
//        private singleton(){}
//        private static singleton instance;
//        public synchronized  static  singleton getInstance(){
//            if(instance==null){
//                //先检验实例对象是否存在
//                synchronized (singleton.class){
//                    //再检查一遍存不存在，若不存在才真正创建实例对象
//                    if (instance==null){
//                        instance=new singleton();
//                    }
//                }
//            }
//            return instance;
//        }

        //5.静态类-单例模式
//        private singleton(){}
//        private static class instance{
//            //静态代码由类加载时jvm保证线程安全；
//            private static singleton sl =new singleton();
//        };
//        public  static singleton getInstance(){
//            return  instance.sl;
//        }

//}

//6.枚举
public enum  singleton{
    INSTANCE;
    public void fun(){

    }
}