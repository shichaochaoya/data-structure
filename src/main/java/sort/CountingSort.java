package sort;


import sort.until.PrintArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] s) {
        if (s.length <= 1) {
            return;
        }
        int max = s[0], min = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i] > max) {
                max = s[i];
            }
            if (s[i] < min) {
                min = s[i];
            }
        }
        int[] tem = new int[max - min + 1];
        Arrays.fill(tem,0);
        for (int i = 0; i < s.length; i++) {
            tem[s[i] - min]++;
        }
        int index = 0, i = 0;
        while (index < s.length) {
            if (tem[i] != 0) {
                s[index] = i + min;
                tem[i]--;
                index++;
            } else
                i++;
        }

    }

    public static void main(String[] args) {
        int[] s = {2, 5, 4, 8, 9, 1, 3, 15};
        PrintArray.printArray(s);
        countingSort(s);
        System.out.println();
        PrintArray.printArray(s);
    }


}
