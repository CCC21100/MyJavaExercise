/**
 * Created with IntelliJ IDEA.
 * Description:管理员
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:43
 */
public class Manager extends User{
    public Manager(String name, String id, String password) {
        super(name, id, password);
    }

    public Manager() {
    }

    @Override
    public void menu() {
        System.out.println("1.查找书籍");
        System.out.println("2.增加书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.显示所有书籍");
        System.out.println("5.退出");
    }

    @Override
    public boolean input() {
        return false;
    }

    @Override
    public void operation(int select) {

    }
}
