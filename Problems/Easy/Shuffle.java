package Problems.Easy;

public class Shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[n * 2];
        for (int i = 0; i < n; i++) {
            shuffledArray[i * 2] = nums[i];
            shuffledArray[(2 * i) + 1] = nums[n + i];
        }
        return shuffledArray;
    }
}
