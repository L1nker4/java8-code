package wang.l1n.functioninterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:28
 * @description：
 */
public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        boolean foo = predicate.test("foo");
        boolean foo1 = predicate.negate().test("foo");
        System.out.println(foo);
        System.out.println(foo1);

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
