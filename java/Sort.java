// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вы
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        int size = 10;
        int min = 1;
        int max = 10;
        getRnd(randomList, size, min, max);
        System.out.println(randomList); // до сортировки
        Collections.sort(randomList); // сортировка sort
        System.out.println(randomList); // после сортировки
    }

    private static void getRnd(ArrayList<Integer> randomList, int size, int min,  int max) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            randomList.add(rnd.nextInt(1, 100));
        }
    }
}