import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileTest {
   public static void read() throws Exception{    //代表当前异常不处理这个错误，扔出去，有人调用这个方法，谁调用谁处理。。
       InputStream inputStream=new FileInputStream(new File("hello,world!"));


   }

    public static void main(String[] args) throws Exception{
        read();
        }
    }


//       try{
//           InputStream inputStream=new FileInputStream(new File("hello,world!"));
//       }catch (Exception e){
//           System.out.println("出错");
//       }finally{
//           System.out.println("结束");
//       }