public class SuperMan {
    String name;
    int blood;
    int attack;
    //构造方法
 public SuperMan(String name,int blood, int attack){
     this.name=name;
     this.blood=blood;
     this.attack=attack;
 }
    public void fight(Monster ms){
        System.out.println(this.name+"暴揍"+ms.name);
        ms.blood-=this.attack;
        System.out.println("灭霸能量"+ms.blood);
    }

}
