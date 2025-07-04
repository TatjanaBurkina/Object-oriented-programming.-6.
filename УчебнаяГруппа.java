// // Класс учебной группы
// public class УчебнаяГруппа {
//     private final String name;

//     public УчебнаяГруппа(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Учебная группа: " + name;
//     }
// }
public class УчебнаяГруппа {
    private final String название;

    public УчебнаяГруппа(String название) {
        this.название = название;
    }

    public String getНазвание() {
        return название;
    }

    @Override
    public String toString() {
        return "Группа: " + название;
    }
}
