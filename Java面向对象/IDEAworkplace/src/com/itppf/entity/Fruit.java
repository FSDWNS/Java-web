package com.itppf.entity;

public abstract class Fruit {
    public abstract void type();
    public abstract  void color();
    public void weight(){
        System.out.println("这个桃子很重！");
    }
}
