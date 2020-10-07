package com.itppf.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class ScondClient  {
    public static void main(String[] args) {
        System.out.println("你想连接哪个数据库？1-mysql 2-orcale");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //全局声明
        IDAO idao=null;
        if(n==1){
             idao=new MysqlDAO();
        }else if(n==2){
              idao=new OrcaleDAO();
        }
        idao.connect();
        idao.add();
        idao.del();
        idao.upd();
        idao.sel();
    }
}
