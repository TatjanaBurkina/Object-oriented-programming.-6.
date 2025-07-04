import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private final String name;
    private final List<StudyGroup> groups;

    public Stream(String name, List<StudyGroup> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    @Override
    public String toString() {
        return "Stream: " + name + ", groups: " + groups.size();
    }
}
