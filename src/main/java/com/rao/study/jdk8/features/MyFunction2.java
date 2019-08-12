package com.rao.study.jdk8.features;

public class MyFunction2 {
    //定义构造方法  ,构造方法实际也有返回类型,这个返回类型就是类的本身的实例
    public MyFunction2(){
        System.out.println("构造方法");
    }

    public MyFunction2(String aaa){
        System.out.println("有参构造方法"+aaa);
    }

    public static String test1(){
        System.out.println("test1静态方法");
        return "test1";
    }

    public String test2(){
        System.out.println("test2实例方法");
        return "test2";
    }

    public static String test3(String ab){
        System.out.println("test3静态方法");
        return "test3-"+ab;
    }

    public String test4(String ab){
        System.out.println("test4实例方法");
        return "test4-"+ab;
    }
}
