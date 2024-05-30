package operations;

import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:48
 */
public class BorrowOperation implements IOperations{
    private String bookname;
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
        System.out.println("借阅图书");
        System.out.println("请输入要借阅图书的书名:");
        Scanner scan = new Scanner(System.in);
        bookname = scan.nextLine();
        int ret = myFind(bookname, bookList);
        if (ret == -1 || (bookList.books[ret].isBorrowed())) {
            System.out.println("无此书或此书已经被借走");
        }
        else {
            System.out.println("借书成功!");
            bookList.books[ret].setBorrowed(true);
        }

    }
}
