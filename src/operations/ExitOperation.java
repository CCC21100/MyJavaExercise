package operations;

import Book.BookList;
import jdk.jfr.internal.tool.Main;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:47
 */
public class ExitOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);//退出系统的操作

    }
}
