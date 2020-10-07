package com.itppf.entity;

public  abstract class AbstractDAO implements IDAO {
    @Override
    public void add() {
        System.out.println("增加数据");
    }

    @Override
    public void del() {
        System.out.println("删除数据");
    }

    @Override
    public void upd() {
        System.out.println("更新数据");
    }

    @Override
    public void sel() {
        System.out.println("查询数据");
    }
}
