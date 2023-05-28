import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Junit {
    SortArray sortArray1 = new SortArray("100.txt");
    SortArray sortArray2 = new SortArray("1k.txt");
    SortArray sortArray3 = new SortArray("10k.txt");
    SortArray sortArray4 = new SortArray("100k.txt");
    SortArray sortArray5 = new SortArray("bestCounting.txt");
    SortArray sortArray6 = new SortArray("test1.txt");
    SortArray sortArray7 = new SortArray("Counting.txt");
    SortArray sortArray8 = new SortArray("2.txt");
    SortArray sortArray9 = new SortArray("50k.txt");
    SortArray sortArray10 = new SortArray("1M.txt");

    @Test
    public void Time_Comparison_sort() {
        long start1 = System.currentTimeMillis();
        sortArray3.simpleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sortArray3.EfficientSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sortArray3.Non_Comparison_Sort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);

        long start4 = System.currentTimeMillis();
        sortArray3.heapSort(false);
        long end4 = System.currentTimeMillis();
        long duration4 = (end4 - start4);

        System.out.println("Time to sort the array with 10k :");
        System.out.println("\u001B[35m[Simple Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Efficient Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Non Comparison Sort] = (" + duration3 + ") ms\u001B[0m");
        System.out.println("\u001B[36m[Heap sort] = (" + duration4 + ") ms\u001B[0m");
    }


    @Test
    public void Test_Simple_sort() {
        ArrayList<int[]> result = sortArray1.simpleSort(false);
        int[] arr = sortArray1.getArr();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }

    @Test
    public void Test_Heap_sort() {
        ArrayList<int[]> result = sortArray6.heapSort(false);
        ArrayList<int[]> steps = sortArray6.heapSort(true);
        int[] arr = sortArray6.getArr();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        for (int i = 0; i < steps.size(); i++) {
            System.out.println("\u001B[34m" + Arrays.toString(steps.get(i)) + "\u001B[0m");
        }
        boolean isEquals = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEquals);
    }


    @Test
    public void Test_Efficient_sort() {
        ArrayList<int[]> result = sortArray1.EfficientSort(false);
        int[] arr = sortArray1.getArr();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        boolean isEquals = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEquals);
    }

    @Test
    public void Test_Non_Comparison_sort() {
        ArrayList<int[]> result = sortArray1.Non_Comparison_Sort(false);
        int[] arr = sortArray1.getArr();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        boolean isEquals = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEquals);
    }

}

