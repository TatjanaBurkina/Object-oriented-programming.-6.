import java.util.Iterator;
import java.util.List;

public class Поток implements Iterable<УчебнаяГруппа> {
    private final String название;
    private final List<УчебнаяГруппа> группы;

    public Поток(String название, List<УчебнаяГруппа> группы) {
        this.название = название;
        this.группы = группы;
    }

    public String getНазвание() {
        return название;
    }

    public List<УчебнаяГруппа> getГруппы() {
        return группы;
    }

    @Override
    public Iterator<УчебнаяГруппа> iterator() {
        return группы.iterator();
    }

    @Override
    public String toString() {
        return "Поток: " + название + ", групп: " + группы.size();
    }
}
