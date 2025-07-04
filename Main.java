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
