package wang.l1n.functioninterface;

import java.util.function.Consumer;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:36
 * @description：
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));
    }

}

class Person1 {
    String firstName = "wang";
    String lastName = "lin";

    Person1() {}

    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
