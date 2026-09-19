package Problems.Easy;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                maxCounter = Math.max(maxCounter, counter);
            } else {
                counter = 0;
            }

        }
        return maxCounter;
    }
}
