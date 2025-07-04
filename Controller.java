import java.util.List;

public class Controller {
    private final StreamService service;

    public Controller(StreamService service) {
        this.service = service;
    }

    public void sortAndPrint(List<Stream> streams) {
        service.sortStreams(streams);
        System.out.println("Streams sorted:");
        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}

