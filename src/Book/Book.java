package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:每本书的类
 * User: chengrui
 * Date: 2023-12-30
 * Time: 16:17
 */
public class Book {
    private String name;//书名
    private String author;//作者名
    private int price;//价格
    private String type;//书的类型
    private boolean isBorrowed;//是否被借出
    //此处不初始化，默认为false，新加的书默认没有借出

    /*使用构造方法初始化一本书*/
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名:'" + name + '\'' +
                ", 作者:'" + author + '\'' +
                ", 价格:" + price +
                ", 类型:'" + type + '\'' +
                ", 是否借出:" + isBorrowed +
                '}';
    }
}
