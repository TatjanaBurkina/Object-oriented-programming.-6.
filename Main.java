import java.util.List;

public class Main {
    public static void main(String[] args) {
        УчебнаяГруппа г1 = new УчебнаяГруппа("QA-01");
        УчебнаяГруппа г2 = new УчебнаяГруппа("QA-02");
        УчебнаяГруппа г3 = new УчебнаяГруппа("QA-03");

        Поток p1 = new Поток("Утро", List.of(г1, г2));
        Поток p2 = new Поток("Вечер", List.of(г3));
        Поток p3 = new Поток("День", List.of());

        List<Поток> потоки = new java.util.ArrayList<>(List.of(p1, p2, p3));


        Контроллер контроллер = new Контроллер(new ПотокСервис());
        контроллер.отсортироватьИВывести(потоки);
    }
}
