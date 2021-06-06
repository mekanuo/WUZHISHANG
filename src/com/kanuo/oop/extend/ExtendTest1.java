package com.kanuo.oop.extend;

/**
 * @author kanuo;
 * @create 2021-06-06 16:54
 * 热身1：试试输出什么？为什么？
 */
public class ExtendTest1 {

    public static void main(String[] args) {
        father3 father3 = new father3();
        father3.sayHallo1();
        father2 f2 = father3;
        f2.sayHallo1();
        father1 f1 = father3;
        f1.sayHallo1();
        System.out.println("---------------------");
        sayF2(f2);

//        sayHallo3:father3
//        sayHallo3:father3
//        sayHallo3:father3
//        ---------------------
//        sayHallo3:father3

    }

    public static void sayF2(father2 f2){
        father1 f21 = (father1)f2;
        f21.sayHallo1();

    }
}
class father1{
    public void sayHallo1(){
        System.out.println("sayHallo1:father1");
    }
}

class father2 extends father1 {
    @Override
    public void sayHallo1(){
        System.out.println("sayHallo2:father2");
    }

}

class father3 extends father2 {
    @Override
    public void sayHallo1() {
        System.out.println("sayHallo3:father3");
    }
}

