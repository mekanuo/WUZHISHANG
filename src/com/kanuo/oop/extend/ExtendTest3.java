package com.kanuo.oop.extend;

/**
 * @author kanuo;
 * @create 2021-06-06 17:00
 * 结论：
 * ExtendTest2中的方法默认指向当前类场景时，如果方法是静态的则没有这个特性；
 */
public class ExtendTest3 {
    public static void main(String[] args) {
        AA bb = new BB();
        System.out.println(bb.sayHello());
        System.out.println(bb.className());
    }
}

class AA {
    public static String sayHello(){
        return "sayHello.AA";
    }
    public String className(){
        return "AA";
    }
}

class BB extends  AA{
    public static String sayHello(){
        return "sayHello.BB";
    }
    public String className(){
        return "BB";
    }
}
