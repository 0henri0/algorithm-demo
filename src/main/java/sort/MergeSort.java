package sort;

class MergeSort extends BaseSort {
    public Integer[] sort(Integer[] nums) {
        Integer[] arrNums = nums.clone();
        mergeSort(arrNums,0,arrNums.length-1);
        return arrNums;
    }

    /**
     * 
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    public static void mergeFun(Integer[] arr, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }

    public static void mergeSort(Integer[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low) / 2 + low;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            mergeFun(arr, low, middle, high);
        }
    }
}