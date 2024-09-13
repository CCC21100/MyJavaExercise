/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chengrui
 * Date: 2024-09-13
 * Time: 21:21
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println(this.name + "正在吃东西");
    }
}
