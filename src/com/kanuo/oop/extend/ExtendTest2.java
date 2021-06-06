package com.kanuo.oop.extend;

/**
 * @author kanuo;
 * @create 2021-06-06 16:58
 * 继承-特性-向上转型时，变量访问默认指向父类；
 * 方法访问默认指向当前类
 */
public class ExtendTest2 {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.a);
        System.out.println(b.str);
        System.out.println(b.gatA());
        System.out.println("----------------");
        B b1 = new B();
        System.out.println(b1.a);
        System.out.println(b1.str);
        System.out.println(b1.gatA());
        System.out.println(b1.getSuperStr());
//        0
//        a
//        1
//         ----------------
//        1
//        b
//        1
//        a

    }
}
class A {
    public int a = 0;
    public String str = "a";
    public int gatA(){
        return a;
    }
}
class B extends A {
    public int a = 1;
    public String str = "b";
    public int gatA(){
        return a;
    }
    public String getSuperStr(){
        return super.str;
    }
}