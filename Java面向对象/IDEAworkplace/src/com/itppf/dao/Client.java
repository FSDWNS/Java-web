package com.itppf.dao;

public class Client {
    public static void main(String[] args) {
//        Noodle n=new Noodle();
//        Rice r=new Rice();
//
//        Cookier c=new Cookier();//new一个厨师
//        c.cook(n);//让厨师做面条
//        c.cook(r);//让厨师做米饭
        Food food1=new Noodle();
        Food food2=new Rice();
        Food food3=new Soup();

        Cookier cookier=new Cookier();
        cookier.cook(food1);
        cookier.cook(food2);
        cookier.cook(food3);

    }
}
