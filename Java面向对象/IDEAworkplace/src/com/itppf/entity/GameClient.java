package com.itppf.entity;

public class GameClient {
    public static void main(String[] args) {
        Game game1=new DNF();
        Game game2=new LOL();
        Game game3=new CS();


        Player player=new Player();
        player.happy(game1);
        System.out.println("****************************");
        player.happy(game2);
        System.out.println("****************************");
        player.happy(game3);
        System.out.println("****************************");

    }
}
