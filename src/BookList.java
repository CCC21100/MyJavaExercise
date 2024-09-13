/**
 * Created with IntelliJ IDEA.
 * Description:书籍列表（书架）
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:47
 */
public class BookList {
    private OneBook[] books = new OneBook[100];
    private int usedSize;

    public BookList() {
        books[0] = new OneBook("三国演义", "罗贯中", 100, "小说", false);
        books[1] = new OneBook("西游记", "吴承恩", 100, "小说", false);
        books[2] = new OneBook("水浒传", "施耐庵", 100, "小说", false);
        this.usedSize = 3;
    }

    public void setBooks(int pos, OneBook book) {
        this.books[pos] = book;
    }

    public OneBook getBooks(int pos) {
        return books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

}
