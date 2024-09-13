/**
 * Created with IntelliJ IDEA.
 * Description:抽象的用户类，包括借阅者和管理员。
 * User: chengrui
 * Date: 2024-05-30
 * Time: 19:40
 */
public abstract class User {
    private String name;
    private String id;
    private String password;

    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public User() {
    }

    public abstract void menu();

    public abstract boolean input();

    public abstract void operation(int select);

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
