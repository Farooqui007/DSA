import java.util.*;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        
        int index = searchInsert(nums, target);
        System.out.println("Target position: " + index);
    }
}
