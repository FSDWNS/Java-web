package com.itppf.entity;

public class Mouse extends Animal {
    public static void main(String[] args) {
 Animal animal=new Animal();
 if(animal instanceof Mouse){
     System.out.println("这是一只老鼠");
        }else{
     System.out.println("这不是老鼠");
 }

    }
}
