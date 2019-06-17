package sort;

import java.util.List;

/**
 * 冒泡排序   算法描述
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 **/

public class BubbleSort {

    public static int[] bubbleSort(int[] s) {
        for (int i = 0; i <= s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j] > s[j + 1]) {
                    int t = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = t;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] s = {2,5,4,8,9,1,3,15};
        bubbleSort(s);
        for (int i = 0;i < s.length-1;i++) {
            System.out.print(s[i]+"\t");
        }
    }

}
