package com.itppf.dao;

public class Vivo extends Phone{
    @Override
    public void name() {
        super.name();             //super可以调用父类中被重写了的内容。
        System.out.println("不！重写之后，我是vivo");
    }

    public static void main(String[] args) {
        Vivo v1=new Vivo();
        v1.name();
    }
}
