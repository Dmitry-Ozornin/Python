import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClassCatMain {

    public static void main(String[] args) {
        ClassCAT cat1 = new ClassCAT(" Васька", 2011, "Черный", "Иванов Иван");
        ClassCAT cat2 = new ClassCAT(" Мурзик", 2010, "Белый", "Петров Петр");
        ClassCAT cat3 = new ClassCAT(" Белящ", 2015, "Трехцветный", "Малятин Александр");
        ClassCAT cat4 = new ClassCAT(" Белящ", 2015, "Трехцветный", "Малятин Александр");
        ClassCAT cat5 = new ClassCAT(" Мурзик", 2010, "Белый", "Петров Петр");

        // System.out.println(cat1 + System.lineSeparator());
        // System.out.println(cat2 + System.lineSeparator());
        // System.out.println(cat3 + System.lineSeparator());

        Set<ClassCAT> cats = new HashSet<>(Arrays.asList(cat1,cat2, cat3, cat4 , cat5));

        for (ClassCAT cat : cats) {
            System.out.println(cat);
            System.out.println();
            
        }
    }
    
}
