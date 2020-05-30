package wang.l1n.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:13
 * @description：
 */
public class Demo {
    public static List<String> name = Arrays.asList("peter", "anna", "mike", "xenia");

    public static void oldMethod() {
        System.out.println(name);
        Collections.sort(name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(name);
    }

    public static void main(String[] args) {
//        oldMethod();
        newMethod();
    }

    private static void newMethod() {
        System.out.println(name);
        Collections.sort(name, (String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println(name);
    }
}
