public class StudyGroup {
    private final String name;

    public StudyGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group: " + name;
    }
}
