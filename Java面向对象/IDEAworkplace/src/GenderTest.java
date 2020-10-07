public class GenderTest {
    public static void main(String[] args) throws GenderException{
        Person person1=new Person("张三","男");
        Person person2=new Person("李四","女");

        Bathhouse bathhouse=new Bathhouse();
//        bathhouse. manBathhouse(person1);
        bathhouse.manBathhouse(person2);
    }
}
