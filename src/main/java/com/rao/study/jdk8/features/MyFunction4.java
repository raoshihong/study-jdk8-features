package com.rao.study.jdk8.features;

@FunctionalInterface
public interface MyFunction4<R> {
    R test();//这表示可以接收无参的构造方法和无参有返回值的静态和实例方法
}
