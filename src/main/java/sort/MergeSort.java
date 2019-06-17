package sort;

import sort.until.PrintArray;

/**
 *
 * */


public class MergeSort {



    /*分解数据*/
    public static void devide(int[] array,int left,int right){

        if(left<right){
            /*寻找到中间下标*/
            int mid=(right+left)/2;
            /*从中间下标隔断，将前后两段分别分解*/
            devide(array,left,mid);
            /*继续分割第二段*/
            devide(array,mid+1,right);
            /*分割完了，调用归并*/
            merge(array,left,mid,mid+1,right);
        }
    }
    /*归并，包含排序*/
    public static void merge(int[] array,int leftStart,int leftEnd,int rightStart,int rightEnd){
        /*新建临时数组，存放该次归并后的数据*/
        int[] temp=new int[array.length];
        /*记录归并的左组和右组开始结束下标*/
        int ls=leftStart,le=leftEnd,
                rs=rightStart,re=rightEnd;
        /*记录临时数组的存放位置*/
        int index=ls;
        /*第一次比较归并，左组合右组中较小的入temp*/
        while(ls<=le&&rs<=re){
            if(array[ls]<=array[rs]){
                temp[index]=array[ls];
                index++;ls++;
            }else{
                temp[index]=array[rs];
                index++;rs++;
            }
        }
        /*第二次选择归并，将array中剩余的未加入temp的数加入到temp中*/
        while(ls<=le){
            temp[index]=array[ls];
            ls++;index++;
        }
        while(rs<=re){
            temp[index]=array[rs];
            rs++;index++;
        }
        /*temp是经过调整后的array，此时一次归并完毕，返回数据进行下一次归并*/
        while(leftStart<=rightEnd){
            array[leftStart]=temp[leftStart];
            leftStart+=1;
        }
        /*打印本次归并结果*/
    }


    public static void main(String[] args) {
        int[] s = {2,5,4,8,9,1,3,15,7};
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+"\t");
        }
        System.out.println();
        devide(s,0,8);
        PrintArray.printArray(s);


    }

}
