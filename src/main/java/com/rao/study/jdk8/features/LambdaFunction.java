package com.rao.study.jdk8.features;

@FunctionalInterface
public interface LambdaFunction {

    //这个方法因为是抽象方法,并没有实现,所以可以通过匿名类的形式或者lambda的形式来实现这个方法
    void test1(String a);

}
