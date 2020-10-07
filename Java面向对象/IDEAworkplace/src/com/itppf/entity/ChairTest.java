package com.itppf.entity;

public class ChairTest {
    public static void chang(Chair chair){
//       chair=new Chair("长椅子");
        chair.name="长椅子";
    }

    public static void main(String[] args) {
        Chair chair=new Chair("短椅子");
        chang(chair);
        System.out.println(chair.name);
    }
}
