// Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class ReversVal {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 5, 4, 3, 6};
        int val = 3;
        int left_i = 0;
        int right_i = arr.length - 1;
        while (left_i < right_i){
            while (arr[right_i] == val && left_i < right_i){
                right_i--;
            }

            if ( arr[left_i] == val){
                arr[left_i] = arr[right_i];
                arr[right_i] = val;
                

            }
            left_i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
