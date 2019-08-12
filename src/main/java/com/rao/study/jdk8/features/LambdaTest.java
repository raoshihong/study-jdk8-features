package com.rao.study.jdk8.features;

public class LambdaTest {

    public static void main(String[] args){

        //之前都是使用::来使用方法的引用,而这些方法都必须是已经实现了的方法,而对于那些没有实现的方法,如接口的方法,则可以通过匿名类或者lambda的方式实现方法

        //这里的lambda表达式,表示实现LambdaFunction接口中定义的抽象方法void test1(String a)
        /**
         * 实际是 :  (String a)->{System.out.println(a);};  等价于
         * void test1(String a){
         *  System.out.println(a);
         * }
         */
        LambdaFunction lambdaFunction = (String a)->{System.out.println(a);};

        //接口中只是定义方法, 上面只是具体实现定义的方法,并没有调用,所以下面调用目标方法
        lambdaFunction.test1("asdf");
    }

}
