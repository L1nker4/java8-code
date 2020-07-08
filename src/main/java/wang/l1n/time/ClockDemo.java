package wang.l1n.time;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/8 14:18
 * @description：
 */
public class ClockDemo {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);

    }
}
