package wang.l1n.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/8 13:22
 * @description： 并行流 顺序流速度测试
 */
public class Demo02 {

    public static int max = 1000000;
    public static List<String> list = new ArrayList<>(max);

    public static void main(String[] args) {

        for (int i = 0; i < max; i++) {
            list.add(UUID.randomUUID().toString());
        }
        test01();
        test02();
    }

    public static void test01(){
        // 纳秒
        long t0 = System.nanoTime();
        long count = list.stream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();
        // 纳秒转微秒
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("顺序流排序耗时: %d ms", millis));
    }

    public static void test02(){
        // 纳秒
        long t0 = System.nanoTime();
        long count = list.parallelStream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();
        // 纳秒转微秒
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("并行流排序耗时: %d ms", millis));

    }
}
