package hw1;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int[] array={2,6,78,8,4,7,87,10,45,24,12};
        int[] array1={2,8,45,67,89,12,3,1,22};
        SortingUtil ar1=new SortingUtil(array);
        SortingUtil ar2=new SortingUtil(array1);
        ar1.insertionSort();
        ar2.quickSort(0,8);
        System.out.println(Arrays.toString(ar1.getArray()));
        System.out.println(Arrays.toString(ar2.getArray()));

    }
}
