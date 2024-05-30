package User;

import operations.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:管理员用户
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:15
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperations[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };//在抽象类中不定义数组大小，在此处构造时写几个元素数组就有多大
    }
    public int menu(){
        System.out.println("--------------------");
        System.out.println(name+"欢迎进入管理员系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("--------------------");
        Scanner scan =new Scanner(System.in);
        return scan.nextInt();
    }
}
