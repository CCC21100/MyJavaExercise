package User;

import operations.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:普通用户
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:14
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperations=new IOperations[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };//在抽象类中不定义数组大小，在此处构造时写几个元素数组就有多大
    }
    public int menu(){
        System.out.println("--------------------");
        System.out.println(name+"欢迎进入图书馆");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("--------------------");
        Scanner scan =new Scanner(System.in);
        return scan.nextInt();
    }
}
