public class sportCar {
    String name;
    int speed;
    String color;
    int seat;
    String country;
    public sportCar(String name,int speed,String color,String country){
        this.name=name;
        this.speed=speed;
        this.color=color;
        this.country=country;
    }
    public sportCar(String name,int speed,String country){
        this.name=name;
        this.speed=speed;
        this.country=country;
    }

    public static void main(String[] args) {
        sportCar car1=new sportCar("阿斯顿马丁",110,"黑色","英国");
        sportCar car2=new sportCar("兰博基尼",200,"意大利");

    }
}
