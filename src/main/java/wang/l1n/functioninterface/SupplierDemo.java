package wang.l1n.functioninterface;

import java.util.function.Supplier;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:33
 * @description：
 */
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Person> supplier = Person::new;
        Person person = supplier.get();
        System.out.println(person.getFirstName() + " " + person.getLastName());
    }
}

class Person {
    String firstName = "wang";
    String lastName = "lin";

    Person() {}

    Person(String firstName, String lastName) {
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
