public class Hero {
    String name;
    String skill_w;
    String skill_a;
    String skill_d;
    String skill_s;

    //构造方法,两个，同名不同参数
    public Hero(String name){
        this.name=name;
    }
    public Hero(String name,String skill_a,String skill_d,String skill_s,String skill_w){
        this(name);
        this.skill_a=skill_a;
        this.skill_d=skill_d;
        this.skill_s=skill_s;
        this.skill_w=skill_w;
    }
//方法
    public void fight(){
        System.out.println(this.name+"英雄的移动技巧");
    }
    public static void main(String[] args) {
        Hero h1=new Hero("亚索","左移","右移","后退","前进");
     h1.fight();
    }
}
