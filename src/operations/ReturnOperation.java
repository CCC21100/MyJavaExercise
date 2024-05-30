package operations;

import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:49
 */
public class ReturnOperation implements IOperations{
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
        System.out.println("归还图书");
        System.out.println("请输入要归还图书的书名:");
        Scanner scan = new Scanner(System.in);
        bookname = scan.nextLine();
        int ret = myFind(bookname, bookList);
        if(ret==-1){
            System.out.println("这不是本图书馆的书");
        }else {
            if(!bookList.books[ret].isBorrowed()){
                System.out.println("您已归还过此书！");
            }else{
                bookList.books[ret].setBorrowed(false);
                System.out.println("归还成功！");
            }
        }
    }
}
