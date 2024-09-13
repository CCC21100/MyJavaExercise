/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chengrui
 * Date: 2024-09-13
 * Time: 21:23
 */
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void eat() {
        System.out.println(this.getName() + "正在啃骨头");
    }
}
