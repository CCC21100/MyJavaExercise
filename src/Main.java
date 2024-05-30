import Book.BookList;
import User.AdminUser;
import User.NormalUser;
import User.User;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:主类，图书管理系统。主要要求架构的设计和java知识的使用。而不重视业务逻辑
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:14
 */
public class Main {
    public static boolean flag=true;
    /*利用向上转型确定是哪个对象*/
    public static User login(){
        System.out.println("请输入你的姓名:");
        Scanner scan=new Scanner(System.in);
        String userName=scan.nextLine();//创建姓名变量接收输入的名字
        System.out.println("请输入身份(1：管理员 0:普通用户)");
        int choice=scan.nextInt();
        if(choice==1){
            return new AdminUser(userName);
        }else{
            return new NormalUser(userName);
        }
    }
    public static void main(String[] args) {
        //0.准备数据
        BookList bookList=new BookList();//实例化一个对象，这样就有了三本书
        //1.登陆系统
        User user=login();
        while(true){
            //利用向上转型，将来user引用的对象可能是管理员，也可能是普通用户
            //当引用的对象不一样，打印的操作菜单就不一样
            //打印菜单 根据选择不同打印不同的
            int choice = user.menu();//要给父类（User）加menu方法，不然调用不了
            //choice接收返回的选择序号，即选的是什么操作
            //使用接口数组，里面放具体的实现类（对应各种操作）
            //需要写一个操作这个接口数组的方法，将choice和数组下标对应的元素串联起来
            user.doOperation(choice,bookList);

        }
    }
}