public class Client {
    public static void main(String[] args) {
        SuperMan sp=new SuperMan("蜘蛛侠",1000,20);
        Monster ms=new Monster("灭霸",500,30);
        sp.fight(ms);
        System.out.println("/*************************************分割/");
        ms.fighted(sp);
    }
}
