package com.itppf.dao;

public class Tiger extends Animal{
    public  String name="奶牛";
    public Tiger(){
        super("老虎");
        System.out.println("子类的构造方法");
    }
    public void eat(){
        System.out.println(super.name);
        System.out.println(this.name);

    }
    public static void main(String[] args) {
        Tiger tiger1=new Tiger();
        tiger1.eat();

    }
}
