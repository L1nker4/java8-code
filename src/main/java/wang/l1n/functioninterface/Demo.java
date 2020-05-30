package wang.l1n.functioninterface;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:19
 * @description：
 */
public class Demo {

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}
