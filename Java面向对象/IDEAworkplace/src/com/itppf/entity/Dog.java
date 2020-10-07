package com.itppf.entity;

public class Dog {
//    String name="小黄";
//    String color="绿色";
//    int age=13;
//
//    public static void main(String[] args) {
//        Dog dog1=new Dog();
//        System.out.println(dog1);
//        System.out.println(dog1.toString());
//    }
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", cllor='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public String toString(){
        return "我的狗的名字叫："+this.name+"我的狗的颜色是："+this.color+"年龄:"+this.age;
    }
    public static void main(String[] args) {
        Dog dog2=new Dog("小黄","黄色",13);
        System.out.println(dog2.toString());
    }
            }
