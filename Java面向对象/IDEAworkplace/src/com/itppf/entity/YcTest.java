package com.itppf.entity;

public class YcTest {
    public static void main(String[] args) {
     try{
         System.out.println(1/1);
     }catch (Exception e){
         e.printStackTrace();   //打印出错误，面向程序员。
         System.out.println("程序出错了！"); //面向用户
     }finally{
         System.out.println("执行finally");
     }
    }
}
