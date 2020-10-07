//public class Car {
//   String color;
//   int speed;
//   int seat;
//   public void run(){
//       System.out.println("车能跑");
//       System.out.println(this);
//       System.out.println(this.color);
//   }
//public void fly(String color){
//    System.out.println(color+"\t颜色的车跑得快");
//}
//    public static void main(String[] args) {
//        Car c=new Car();
//        c.speed=100;
//        c.color="red";
////        System.out.println(c.color);
////       c.run();
//        c.fly("黑色");
//
//    }
//}



public class Car {
    String color;
    int speed;
    int seat;
    public  void  run(){
        System.out.println(this.color+"颜色的车在跑");
        System.out.println(this.speed+"速度的车在跑");
        System.out.println(this.seat+"座位的车在跑");
    }
    public Car(String color,int speed,int seat){
      this.color=color;
      this.speed=speed;
      this.seat=seat;
    }
    public static void main(String[] args) {
        Car c=new Car("红色",120,10);
        Car c1=new Car("绿色",180,15);
        c.run();
        c1.run();

    }
}
