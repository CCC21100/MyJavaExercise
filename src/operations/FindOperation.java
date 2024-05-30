package operations;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:查找图书
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:42
 */
public class FindOperation implements IOperations,Comparable<FindOperation>{

    public String bookname;
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入要查找的书名:");
        Scanner scan =new Scanner(System.in);
        bookname=scan.nextLine();
        for (int i = 0; i < BookList.useSize; i++) {
            //(bookname.compareTo(bookList.books[i].getName())==0)
            if((bookname.compareTo(bookList.books[i].getName())==0)){
                System.out.println("找到了");
                System.out.print("书名："+bookList.books[i].getName()+" ");
                System.out.print("作者："+bookList.books[i].getAuthor()+" ");
                System.out.print("价格："+bookList.books[i].getPrice()+" ");
                System.out.println("类型："+bookList.books[i].getType());
            }
            else{
                System.out.println("没有这本书");
            }
        }
    }


    @Override
    public int compareTo(FindOperation o) {
        if(this.bookname.equals(o.bookname)){
            return 0;
        }
        else {
            return 1;
        }
    }
}
