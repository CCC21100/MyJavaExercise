package operations;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:删除图书
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:42
 */
public class DelOperation implements IOperations{
    public String bookname;
    private int myFind(String bookname, BookList bookList){
        for (int i = 0; i < BookList.useSize; i++) {
            if((bookname.compareTo(bookList.books[i].getName())==0)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入要删除的书名：");
        Scanner scan =new Scanner(System.in);
        bookname=scan.nextLine();
        int ret=myFind(bookname,bookList);
        if (ret==-1){
            System.out.println("书架中不存在该书！");
        }else {
            for (int i = ret; i <BookList.useSize-1 ; i++) {
                bookList.books[i]=bookList.books[i+1];
            }
            bookList.books[BookList.useSize]=null;//将数组中存储的地址置为空
            BookList.useSize--;//将使用的空间减1
            System.out.println("删除成功！");
        }

    }
}
