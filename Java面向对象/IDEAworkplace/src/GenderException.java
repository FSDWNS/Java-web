//自己定义的必须继承Exception或者RuntimeException
public class GenderException extends Exception {
    public GenderException(String msg){
        super(msg);        //调用父类的构造方法

    }
}
