public class Monster {
    String name;
    int blood;
    int attack;
    public Monster(String name,int blood, int attack){
        this.name=name;
        this.blood=blood;
        this.attack=attack;
    }
    public void fighted(SuperMan sp){
        System.out.println(this.name+"在揍"+sp.name);
        sp.blood-=this.attack;
        System.out.println("蜘蛛侠能量"+sp.blood);
    }
}
