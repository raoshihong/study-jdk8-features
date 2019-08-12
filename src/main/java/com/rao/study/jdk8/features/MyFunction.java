package com.rao.study.jdk8.features;

@FunctionalInterface //这个注解要和不要都一样,只是有了这个注解可以方便编译器的检测,只能有一个抽象方法,可以有多个默认方法,静态方法
public interface MyFunction{

    /**
     * 定义抽象方法 ,外部可以通过实现抽象方法,或者将方法的引用进行赋值给他,让后调用display,就是调用赋值的那个引用方法
     */
    void display();//只能有一个抽象方法

    //定义默认方法
    default void play(){
        System.out.println("play");
    }

    default String play2(){
        System.out.println("play2");
        return "play2-2";
    }

    static String kk(){
        System.out.println("kk");

        return "kk-1";
    }

    default void myPlay(String a){
        System.out.println(a);
    }

    static void myPlay1(String a){
        System.out.println(a);
    }

    static String myPlay2(String bb){
        return bb;
    }

    default String myPlay3(String aa){
        return aa;
    }

}
