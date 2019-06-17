package sort;


/**
 *
 * */

public class ShellSort {

    public static int[] shellSort(int[] s){



        return s;
    }

    public static void main(String[] args) {
        int[] s = {2,5,4,8,9,1,3,15};
        for (int i = 0; i < s.length-1; i++) {
            System.out.print(s[i]+"\t");
        }
        System.out.println();
        shellSort(s);
        for (int i = 0;i < s.length-1;i++) {
            System.out.print(s[i]+"\t");
        }
    }

}
