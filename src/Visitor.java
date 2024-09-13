/**
 * Created with IntelliJ IDEA.
 * Description:借阅者
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:43
 */
public class Visitor extends User implements Operation{
    public Visitor(String name, String id, String password) {
        super(name, id, password);
    }

    public Visitor() {
    }

    @Override
    public void menu() {
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("4.退出");
    }

    @Override
    public boolean input() {
        return false;
    }

    @Override
    public void operation(int select) {

    }
}
