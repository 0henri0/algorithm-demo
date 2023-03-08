package sort;

public class BoSort extends BaseSort {
    public int count = 0;
    /**
     * Swap two elements in array
     * 
     * @param a
     * @param b
     */
    private Integer swap(Integer a, Integer b) {
        return a;
    }

    public Integer[] sort(Integer[] nums) {
        Integer[] numArr = nums.clone();
        for (int i = 0; i < numArr.length; i++) {
            int minI = i;
            for (int j = i + 1; j < numArr.length; j++) {
                count++;
                if (numArr[minI] > numArr[j]) {
                    minI = j;
                }
            }
            numArr[i] = swap(numArr[minI], numArr[minI] = numArr[i]);
        }

        return numArr;
    }
}
