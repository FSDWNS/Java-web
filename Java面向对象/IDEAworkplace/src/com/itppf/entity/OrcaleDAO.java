package com.itppf.entity;

public class OrcaleDAO extends AbstractDAO{
    @Override
    public void connect() {
        System.out.println("连接orcale数据库！");
    }
}
