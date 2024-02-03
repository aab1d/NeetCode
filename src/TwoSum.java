import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elementMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(elementMap.containsKey(target-nums[i])){
                return new int[]{elementMap.get(target-nums[i]), i};
            }
            else {
                elementMap.put(nums[i], i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
