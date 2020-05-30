package wang.l1n.functioninterface;

import java.util.function.Function;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:31
 * @description：
 */
public class functionDemo {

    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        String apply = backToString.apply("123");
        System.out.println(apply);
    }
}
