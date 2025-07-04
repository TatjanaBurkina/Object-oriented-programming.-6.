// import java.util.Collections;
// import java.util.List;

// // Класс сервиса, сортирующий список потоков
// public class ПотокСервис {
//     public void сортироватьПотоки(List<Поток> потоки) {
//         Collections.sort(потоки, new StreamComparator());
//     }
// }
import java.util.Collections;
import java.util.List;

public class ПотокСервис {
    public void отсортироватьПотоки(List<Поток> потоки) {
        Collections.sort(потоки, new StreamComparator());
    }
}
