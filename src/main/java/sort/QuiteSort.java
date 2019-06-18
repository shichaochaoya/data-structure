package sort;

import sort.until.PrintArray;

public class QuiteSort {
    /**
     * 快速排序
     * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
     * <p>
     * 从数列中挑出一个元素，称为 “基准”（pivot）；
     * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
     * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     */


    /*public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    *//**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     *//*
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    *//**
     * 交换数组内两个元素
     * @param array
     *//*
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }*/

    public static void QuickSort2(int[] array,int start,int end)
    {
        if(start<end)
        {
            int key=array[start];//初始化保存基元
            int i=start,j;//初始化i,j
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
                {
                    int temp=array[j];
                    array[j]=array[i+1];
                    array[i+1]=temp;
                    i++;
                }

            }
            array[start]=array[i];//交换i处元素和基元
            array[i]=key;
            QuickSort2(array, start, i-1);//递归调用
            QuickSort2(array, i+1, end);

        }

    }


    public static void main(String[] args) {
        int[] s = {2,5,4,8,9,1,3,15,7};
        PrintArray.printArray(s);
        System.out.println();
        QuickSort2(s,0,8);
        PrintArray.printArray(s);
    }
}
