/**
 * Created with IntelliJ IDEA.
 * Description:书本对象，包括书名，作者，价格，类型，是否被借出。
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:45
 */
public class OneBook {
    private String title;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;

    public OneBook(String title, String author, int price, String type, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    public OneBook() {
    }

    @Override
    public String toString() {
        return "OneBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
