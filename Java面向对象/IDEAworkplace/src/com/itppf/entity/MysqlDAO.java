package com.itppf.entity;

public class MysqlDAO extends AbstractDAO {
    @Override
    public void connect(){
        System.out.println("连接mysql数据库！");
    }
}
