package com.rao.study.jdk8.features;

/**
 * 定义一个接口,因为没有使用@FunctionalInterface,所以可以定义多个抽象方法,这样的话,这个接口不能用来接收方法的引用
 */
public interface MyFunction3 {

    //如果这个接口只有一个抽象方法,那么可以接收方法引用,但是如果多个抽象方法,则不允许

    //定义一个抽象方法
    String test();

//    String test1();

}
