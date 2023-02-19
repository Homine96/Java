package Sem3;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args)  {
        int [] arr = {1, 2, 5, 3 , 7, 10, 8};
        int [] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    
       
  }
public static int[] mergeSort(int[] src) {
    if (src.length <= 1) return src;
    int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
    int[] right = Arrays.copyOfRange(src, left.length, src.length);
    return merge(mergeSort(left), mergeSort(right));
}

public static int[] merge(int[] left, int[] right) {

    int[] result = new int[left.length + right.length];

    int resIn = 0, leftIn = 0, rightIn = 0;
   
    while (leftIn < left.length && rightIn < right.length)
        if (left[leftIn] < right[rightIn]) 
            result[resIn++] = left[leftIn++];
        else result[resIn++] = right[rightIn++];
    
    while (resIn < result.length)
        if (leftIn != left.length) 
            result[resIn++] = left[leftIn++];
        else result[resIn++] = right[rightIn++];

    return result;
}

}
