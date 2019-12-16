import java.time.LocalDateTime;
import java.time.LocalTime;

public class Browser {
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Browser.sleep(5);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
    }
}
