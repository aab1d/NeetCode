import java.util.Set;
import java.util.HashSet;
public class ContainsDuplicate {
        public static boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums)
                set.add(num);
            return set.size() != nums.length;
        }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }
}
