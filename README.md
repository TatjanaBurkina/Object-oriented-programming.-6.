# 📚 Stream & Study Group Management System (Управление потоками и учебными группами)

Учебный Java-проект, демонстрирующий принципы объектно-ориентированного программирования (ООП), архитектурное разделение на слои (`Controller`, `Service`), а также работу с коллекциями, итераторами и компараторами (`Iterable`, `Comparator`). В этом обновлении код полностью переведен на английский язык.

---

## 📂 Структура проекта

Исходный код приложения включает в следующие основные компоненты:

```text
├── Main.java              # Точка входа в приложение
├── Controller.java        # Управляющий класс для обработки и вывода потоков
├── StreamService.java     # Сервисный слой для сортировки потоков
├── StreamComparator.java  # Компаратор для сравнения потоков по количеству групп
├── Stream.java            # Сущность потока (реализует Iterable<StudyGroup>)
└── StudyGroup.java        # Сущность учебной группы



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("QA-01");
        StudyGroup group2 = new StudyGroup("QA-02");
        StudyGroup group3 = new StudyGroup("QA-03");

        Stream stream1 = new Stream("Morning", List.of(group1, group2));
        Stream stream2 = new Stream("Evening", List.of(group3));
        Stream stream3 = new Stream("Afternoon", List.of());

        List<Stream> streams = new ArrayList<>(List.of(stream1, stream2, stream3));

        Controller controller = new Controller(new StreamService());
        controller.sortAndPrint(streams);
    }
}
