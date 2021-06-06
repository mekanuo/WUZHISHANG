package com.kanuo.oop.extend;

/**
 * @author kanuo;
 * @create 2021-06-06 17:12
 * 类加载顺序：
 * 静态代码快（受位置影响） 》 继承构造器 》 类组合（受位置影响） 》 自身构造器；
 * 怎么区分使用继承还是组合：
 * 继承- 树状结果，有根，强调是一个什么，如果有向上转型需求则必选继承；
 * 组合 - 强调有一个什么，多用于多种不相干对象的组合；
 *
 * 另外：
 * JAVA的单根继承让垃圾回收变得容易实现‘
 */
public class ExtendTest4 extends BB1{
    private  B1 b1 = new B1();
    private  C1 c1 = new C1();
    private  D1 d1 = new D1();

    ExtendTest4(){
        System.out.println("ExtendTest4");
    }
    public static void main(String[] args) {
        new ExtendTest4();
//        a
//        bb1
//        b
//        c
//        static d
//        d
//        ExtendTest4
    }
}
class A1{
    A1(){
        System.out.println("a");
    }
}

class B1{
    B1(){
        System.out.println("b");
    }
}

class C1{
    C1(){
        System.out.println("c");
    }
}

class D1{
    D1(){
        System.out.println("d");
    }
    static {
        System.out.println("static d");
    }
}

class AA1 extends A1 {
    AA1(){
        System.out.println("aa1");
    }
}

class BB1 extends A1 {
    BB1(){
        System.out.println("bb1");
    }
}