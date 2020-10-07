package com.itppf.dao;

import java.util.Scanner;

public class FirstClient {
    public static void main(String[] args) {
        System.out.println("你想要连接哪一个数据库");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n==1){
           IDAO idao=new MysqlDAO();
           idao.connect();
           idao.add();
           idao.del();
           idao.upd();
           idao.sel();
        }else if(n==2){
            IDAO idao=new OrcaleDAO();
            idao.connect();
            idao.add();
            idao.del();
            idao.upd();
            idao.sel();
        }
    }
}
