import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:测试系统的功能
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:38
 */
public class SystemTest {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        System.out.println("系统测试结束");
        System.out.println();
    }
    public static User login(){
        System.out.println("欢迎进入系统测试");
        System.out.println("请选择您的身份：1.管理员 2.访客");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if (select==1){
            return new Manager();
        } else{
            return new Visitor();
        }
    }

}
