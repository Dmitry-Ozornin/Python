// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
public class Program {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
                // if (count > maxCount){
                //     maxCount = count;
                // }
                // тернарный оператор maxCount = count > mmaxCount ? count : maxCount;
                maxCount = Math.max(maxCount, count);

            } else {
                count = 0;
            }
            
        }
        System.out.println(maxCount);
    } 
}
