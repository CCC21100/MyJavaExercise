package User;

import Book.BookList;
import operations.IOperations;

/**
 * Created with IntelliJ IDEA.
 * Description:用户类
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:15
 */
public abstract class User {
    protected String name;//无论是普通用户还是管理员都有名字

    /*虽然定义了一个数组，
    却因为main方法中if-else只会走一个，
    new普通用户和管理员中的一个，
    所以一个数组在普通用户和管理员两个类中是可以不一样的*/
    protected IOperations[] iOperations;//定义一个接口数组，里面存储实现这个接口的操作类，这样数组的每个元素就对应一种操作

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();

    //在父类中写接口数组操作方法，这样无论创建的哪个子类都可以调用
    public void doOperation(int choice, BookList bookList){
        iOperations[choice].work(bookList);
        //iOperations[choice]拿到了choice下标对应的对象，再调用里面的work方法操作名为bookList的数组
    }
}
