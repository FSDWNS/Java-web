package com.itppf.dao;
//单继承，多实现。
public class Home extends Place implements Country,Province,Area,Type{  //这里要讲，你的家不仅仅在这个国家里面，而且在这个城市里面，或者定义大小，你家有多大？多态性的体现。
//重写了一个继承的父类和三个接口，一个是展示你居住地的省份，一个是国家，还有一个是居住面积。
    @Override        //表示这个方法是重写的
    public void specificplace() {
//        super.specificplace(); //super调用的是父类的方法。
        System.out.println("你家居住的具体位置在哪里？");
    }

    @Override
    public void specificsize() {
        System.out.println("你家的居住面积多大？");
    }

    @Override
    public void specificprovince() {
        System.out.println("你家居住在哪个省份？");
    }

    @Override
    public void specificcountry() {
        System.out.println("你家居住在哪个国家？");
    }
    @Override
    public void specifictype() {
        System.out.println("你家是什么建筑风格？");
    }

}
