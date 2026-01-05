import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        var arrayStart = OffsetDateTime.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());
        var vectorStart = OffsetDateTime.now();
        List<Integer> Vector = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            Vector.add(i);
        }
        System.out.println(Duration.between(vectorStart,OffsetDateTime.now()).toMillis());
    }
}
