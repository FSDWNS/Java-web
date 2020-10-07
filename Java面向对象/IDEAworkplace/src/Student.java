public class Student {
    String name;
    String sex;
    int age;
    public Student(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;

    }

    public static void main(String[] args) {
        Student s1=new Student("张三","男",25);

        Student s2=new Student("李四","女",22);

        s1.name="李四";
        s2.name="张三";
        System.out.println(s1.name);
        System.out.println("/*******************************/");
        System.out.println(s2.name);

    }
}
