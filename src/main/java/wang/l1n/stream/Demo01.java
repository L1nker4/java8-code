package wang.l1n.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/8 13:11
 * @description：
 */
public class Demo01 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ddd2");
        list.add("aaa2");
        list.add("bbb1");
        list.add("aaa1");
        list.add("bbb3");
        list.add("ccc");
        list.add("bbb2");
        list.add("ddd1");

        list.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        list.stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("----------------------------------");
        list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        boolean a = list.stream().anyMatch((s) -> s.startsWith("a"));
        System.out.println(a);


        System.out.println("----------------------------------");
        long a1 = list.stream().filter(s -> s.startsWith("a"))
                .count();
        System.out.println(a1);

        Optional<String> reduce = list.stream().sorted().reduce((s1, s2) -> s1 + "+" + s2);
        reduce.ifPresent(System.out::println);
    }
}
