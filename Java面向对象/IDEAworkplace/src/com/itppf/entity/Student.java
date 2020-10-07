package com.itppf.entity;

public class Student {
    private int id;
    private String name;
    private String sex;
    private String address;
    //set方法，由于上面定义的方法全是私有的，不能够在其他类使用，而我们在某些情况下要保护这些信息，因此使用set/get方法去拿取。
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
       return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return this.sex;

    }


    public void setAddress(String address) {
        this.address=address;
    }

    public  String getAddress(){
        return this.address;
    }
}
