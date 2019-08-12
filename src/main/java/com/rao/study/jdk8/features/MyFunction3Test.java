package com.rao.study.jdk8.features;

public class MyFunction3Test {
    public static void main(String[] args){
        //这里只是将方法定义赋值,并没有调用方法
        MyFunction3 myFunction3 = ()->{System.out.println("sss");return "sdf";};

        //在这里调用方法
        myFunction3.test();

        // :: 表示使用方法的引用,而这个引用的赋值必须要有一个@FunctionInterface类型的接口来接收,否则报错
//        MyFunction2 myFunction2 = MyFunction2::new;

        // 方法引用赋值,被赋值的接口的方法格式必须与目标方法定义一致（类似于C++中的方法引用与定义）

        MyFunction4<MyFunction2> myFunction4 = MyFunction2::new;//将构造方法的引用赋值给myFunction4->test

        //通过myFunction4.test 调用目标方法
        MyFunction2 myFunction2 = myFunction4.test();//这里相当于调用MyFunction2的构造方法,创建MyFunction2的实例

        //引用有参构造方法,所以MyFunction2中必须要有有参构造方法
        MyFunction5<String,MyFunction2> function5 = MyFunction2::new;

        //通过function5.test5 调用目标方法
        function5.test5("sss");//这里表示调用了MyFunction2的有参构造方法

        //传递静态方法的引用
        test(MyFunction2::test3,"ssss");

        //传递实例方法的引用
        MyFunction2 myFunction21 = new MyFunction2();
        test(myFunction21::test4,"bbbb");
    }


    public static void test(MyFunction5<String,String> myFunction5,String ab){
        //通过方法的引用地址调用目标方法
        myFunction5.test5(ab);
    }

}
