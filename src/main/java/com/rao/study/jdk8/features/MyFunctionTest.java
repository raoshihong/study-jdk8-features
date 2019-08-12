package com.rao.study.jdk8.features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyFunctionTest {

    public static void main(String[] args) {

        //采用函数式编程的方式,实现他的抽象方法目标方法
        MyFunction myFunction = () -> {
            System.out.println("sdf");
        };
        System.out.println(myFunction);
        //调用目标方法
        myFunction.display();

        myFunction.play();

        System.out.println(myFunction.play2());

//        MyFunction::kk //这个表示方法的引用

        Supplier supplier = MyFunction::kk;//这里相当于将MyFunction中的kk方法的应用赋值给supplier中的get抽象方法,所以get抽象方法指向MyFunction中的kk方法
        System.out.println(supplier.get());

        MyFunction myFunction1 = MyFunction::kk;
        myFunction1.display();
        myFunction1.play();


        test(MyFunction::myPlay1,"abc");//这里表示将myPlay1的方法的引用传递到test方法中,实际就是consumer->accept = MyFunction-> myPlay1 所以consumer.accept(aa) 等价于 MyFunction.myPlay1(a)

        new MyFunctionTest().myTest(MyFunction::myPlay2);//直接用类名::方法名  ,这里的方法必须是静态方法
        new MyFunctionTest().myTest(myFunction::myPlay3);//直接用对象名::方法名  ,这里的方法必须是实例方法

        //访问构造方法

    }

    /**
     * 定义实例方法
     */
    public void myTest(Function<String,String> function){

    }

    /**
     * 定义静态方法
     */
    public static void test(Consumer<String> consumer,String abc){
        consumer.accept(abc);//在这里调用consumer.accept(abc) 等价于 MyFunction::myPlay1(abc)
    }

}
