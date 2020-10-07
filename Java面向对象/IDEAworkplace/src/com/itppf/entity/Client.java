package com.itppf.entity;

public class Client {
    public static void main(String[] args) {
        Food food1=new Noodle();
        Food food2=new Rice();
        Food food3=new Soup();

        Cookier cookier=new Cookier();
        cookier.Food(food1);
        cookier.Food(food2);
        cookier.Food(food3);


    }
}
