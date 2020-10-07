package com.itppf.entity;

public class FruitClient {
    public static void main(String[] args) {
        Fruit fruit1=new Apple();
        Fruit fruit2=new Peach();

        Saler saler1=new Saler();
        saler1.sale(fruit1);
        System.out.println("*******************");
        saler1.sale(fruit2);
    }
}
