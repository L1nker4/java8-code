package wang.l1n.functioninterface;

import java.util.Comparator;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:43
 * @description：
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        int compare = comparator.compare(p1, p2);
        System.out.println(compare);
        int compare1 = comparator.reversed().compare(p1, p2);
        System.out.println(compare1);
    }
}
