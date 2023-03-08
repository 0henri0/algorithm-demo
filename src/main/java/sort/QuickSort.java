package sort;

public class QuickSort extends BaseSort {
    public int count = 0;

    private Integer partition(Integer[] nums, Integer low, Integer high) {
        int pivot = nums[high];
        int left = low;
        int right = high - 1;
        while (true) {
            count++;
            while (low < high && nums[left] < pivot && left < high)
                left++;
            while (low < high && nums[right] > pivot && right > 0)
                right--;
            if (left >= right)
                break;
            nums[left] = swap(nums[right], nums[right] = nums[left]);
            left++;
            right--;
        }
        nums[left] = swap(nums[high], nums[high] = nums[left]);

        return left;
    }

    private Integer[] quickSort(Integer[] nums, Integer low, Integer high) {
        if (low < high) {
            int index = partition(nums, low, high);

            quickSort(nums, low, index - 1);
            quickSort(nums, index + 1, high);
        }

        return nums;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    private int swap(int a, int b) {
        return a;
    }

    public Integer[] sort(Integer[] nums) {
        Integer[] numArr = nums.clone();
        Integer high = numArr.length - 1;
        Integer low = 0;
        return quickSort(numArr, low, high);
    }

}
