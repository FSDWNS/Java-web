package com.itppf.entity;
public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("李四");
        s1.setSex("男");
        s1.setAddress("中国甘肃");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s1.getAddress());
        System.out.println("该生学号为:"+s1.getId()+";\n姓名为:"+s1.getName()+";\n性别为:"+s1.getSex()+";\n籍贯为:"+s1.getAddress());

    }
}
