package wang.l1n.defaultmethod;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 15:10
 * @description：
 */
public interface DefaultMethod {

    double calc(int a, int b);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
