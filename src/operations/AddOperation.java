package operations;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:增加图书
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:42
 */
public class AddOperation implements IOperations{

    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scan = new Scanner(System.in);
        if(BookList.useSize<bookList.books.length-1) {
            System.out.println("请输入书名:");
            String name=scan.nextLine();
            System.out.println("请输入作者名:");
            String author=scan.nextLine();
            System.out.println("请输入价格:");
            int price=scan.nextInt();
            scan.nextLine();
            System.out.println("请输入类型:");
            String type=scan.nextLine();
            bookList.books[BookList.useSize]=new Book(name,author,price,type);
            BookList.useSize++;
            System.out.println("添加成功");
        }else{
            System.out.println("书架已满，无法添加！");
        }
    }
}
