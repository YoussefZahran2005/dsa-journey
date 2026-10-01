package Problems.Easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int getMaxProduct(int[] nums) {
        Arrays.sort(nums);

        int index = nums.length;

        int p1 =  nums[index - 1] * nums[index - 2] * nums[index - 3];
        int p2 = nums[0] * nums[1] * nums[index-1];

        return Math.max(p1, p2);

    }
}
