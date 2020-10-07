import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String username="admin";
        String userpassword="admin";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");

        String uname=scanner.nextLine();
        System.out.println("请输入密码：");

        String upassword=scanner.nextLine();

        if (uname.equals(username) && userpassword.equals(upassword) ){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
