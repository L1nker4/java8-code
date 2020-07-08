package wang.l1n.optional;

import java.util.Optional;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:45
 * @description：
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        System.out.println(optional.get());

        Optional<String> optional1 = Optional.of(new String("hello world"));
        optional1.ifPresent(System.out::println);

        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2.orElse("hello"));
    }
}
