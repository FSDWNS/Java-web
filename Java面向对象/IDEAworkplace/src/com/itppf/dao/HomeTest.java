package com.itppf.dao;

public class HomeTest {
    public static void main(String[] args) {
//        Home home1=new Home();
//        home1.specificpoint();

         Home home1=new Home(); //从家的方面去看我家，创建对象“hom1”；
         Type home2=new Home(); //从件筑风格的方面去看我家，创建对象“hom2”；（向上转型）
         Area home3=new Home();  //从建筑面积的方面去看我家，创建对象“hom3”； （向上转型）
        Province home4=new Home();  //从哪个省的方面去看我家，创建对象“hom4”； （向上转型）
        Country home5=new Home(); //从哪个国家的方面去看我家，创建对象“hom1”；（向上转型）

        //以上很好地展现出了java的多态性。

        System.out.println("-----从家的方面去调用home1具体实例-----");
        home1.specificplace();
        home1.specifictype();
        home1.specificsize();
        home1.specificprovince();
        home1.specificcountry();
        System.out.println("*******");

        System.out.println("-----从建筑风格的方面去调用home2具体实例-----");
//        home2.specificplace();
        home2.specifictype();
//        home2.specificsize();
//        home2.specificprovince();
//        home2.specificcountry();
//    由上可知，在建筑风格的角度去调用，只能看到家里建筑风格，大小，国家，省份看不到
        System.out.println("*******");


        System.out.println("-----从建筑大小的方面去调用home3具体实例-----");
//        home3.specificplace();
//        home3.specifictype();
        home3.specificsize();
//        home3.specificprovince();
//        home3.specificcountry();
//    由上可知，在建筑大小的角度去调用，只能看到家里建筑大小，风格，国家，省份看不到
        System.out.println("*******");


        System.out.println("-----从居住省份的方面去调用home4具体实例-----");
//        home4.specificplace();
//        home4.specifictype();
//        home4.specificsize();
       home4.specificprovince();
//        home4.specificcountry();
//    由上可知，在居住省份的角度去调用，只能看到家里居住的省份，大小，国家，建筑风格看不到
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");


        System.out.println("-----从居住国家的方面去调用home5具体实例-----");
//        home5.specificplace();
//        home5.specifictype();
//        home5.specificsize();
//        home5.specificprovince();
        home5.specificcountry();
//    由上可知，在居住国家的角度去调用，只能看到家里居住的国家，大小，风格，省份看不到
        System.out.println("*******");




    }
}
