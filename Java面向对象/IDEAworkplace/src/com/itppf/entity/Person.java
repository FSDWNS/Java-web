package com.itppf.entity;//包的声明

public class Person {
    public String pub="public";
    protected String pro="protected";
    private String pri="private";
    String def="default";
        public static void main(String[] args) {
          Person p1=new Person();
            System.out.println(p1.pub);
            System.out.println(p1.pro);
            System.out.println(p1.pri);
            System.out.println(p1.def);
    }
}
