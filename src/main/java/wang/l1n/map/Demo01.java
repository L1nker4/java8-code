package wang.l1n.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/8 14:11
 * @description： Map
 */
public class Demo01 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println("=======================");
        Set<Integer> set = map.keySet();
        System.out.println(set);

        System.out.println("======================");
        Collection<String> values = map.values();
        System.out.println(values);
    }
}
