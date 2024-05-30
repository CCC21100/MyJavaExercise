package operations;

import Book.Book;
import Book.BookList;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:展示书架中的图书
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:42
 */
public class DisplayOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        int currentSize=bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.books[i];//拿到一本打印一本，这样就不会重复打印
            System.out.println(book);
        }
    }
}
