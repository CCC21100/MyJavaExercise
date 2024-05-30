package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:书架（数组）
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:20
 */
public class BookList {
    public Book[] books=new Book[10];//定义一个书架数组，最多放十本书（学习数据库可以把书放到数据库，这样才是真正的书架）
    public static int useSize;//定义计数器，记录书架中书的数量，当计数器等于数组长度时则放满了

    /*使用构造方法默认放上三本书*/
    public BookList() {
        books[0]=new Book("三国演义","罗贯中",78,"小说");
        books[1]=new Book("水浒传","施耐庵",88,"小说");
        books[2]=new Book("红楼梦","吴承恩",98,"小说");
        BookList.useSize = 3;
    }
    public int getUseSize(){
        return useSize;
    }
    //接下来应该写一些对于书架的增删查改操作的方法，我们把这些方法放到一个文件包operations里面
}
