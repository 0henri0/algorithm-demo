package sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quick {
    public static void main(String[] args) {
        final String dir = System.getProperty("user.dir");
        System.out.println(dir);
        QuickSort quickSort = new QuickSort();
        BoSort bSort = new BoSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();

        List<Integer> arr = getNumberArrayFromFile();
        Integer[] arrResult = new Integer[arr.size()];
        arrResult = arr.toArray(arrResult);

        long start1 = System.nanoTime();
        Integer[] resultQ = quickSort.sort(arrResult);
        long end1 = System.nanoTime();
        // System.out.println(Arrays.toString(resultQ));
        System.out.println("time: " + (double) (end1 - start1) / 1_000_000_000);
        System.out.println("================================================================");

        long start2 = System.nanoTime();
        Integer[] resultM = mergeSort.sort(arrResult);
        long end2 = System.nanoTime();
        System.out.println("time: " + (double) (end2 - start2) / 1_000_000_000);
        System.out.println("================================================================");

        long start3 = System.nanoTime();
        Integer[] resultH = heapSort.sort(arrResult);
        long end3 = System.nanoTime();
        // System.out.println(Arrays.toString(resultH));
        System.out.println("time: " + (double) (end3 - start3) / 1_000_000_000);
        System.out.println("================================================================");
    }

    private static List<Integer> getNumberArrayFromFile() {
        List<Integer> arrayList = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/main/java/sort/numbers.txt"));
            String line = bf.readLine();
            while (line != null) {
                arrayList.add(Integer.parseInt(line));
                line = bf.readLine();
            }
        } catch (IOException $e) {
            return arrayList;
        }

        return arrayList;
    }
}
