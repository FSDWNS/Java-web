public class Cow {
    String name;
    String color;
    int age;
    public Cow(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
     public boolean equals(Cow cow){
     if(this.name==cow.name){
         return true;
     }else{
         return false;
     }
}
    public static void main(String[] args) {
        Cow cow1=new Cow("小黄","黑色",11);
        Cow cow2=new Cow("小黄","黄色",12);


//        System.out.println(cow1==cow2);
        System.out.println(cow1.equals(cow2));
    }
}
