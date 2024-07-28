// Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала.

// Пример


// // Дан 
// [1, One, 2, Two]

// // Вывод
// [1, One, 2, Two]
// [Two, 2, One, 1]

import java.util.LinkedList;
import java.util.List;

class LLTasks {
    
    public static List<Object> revertLL(List ll) {
        // Напишите свое решение ниже
       List<Object> reverslist = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reverslist.add(ll.get(i));  
        }
        // System.out.println(reverslist);
       
        return reverslist;

      

}
    }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Listrevers{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        List<Object> ll2 = answer.revertLL(ll);
        System.out.println(ll2);
    }
}