class DSA2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        DSA2 obj = new DSA2();
        obj.nextPermutation(nums);
        
        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find first decreasing number from right
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1])
                break;
        }

        // Step 2: If found, find the next larger number and swap
        if (i >= 0) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
        }

        // Step 3: Reverse the elements from i+1 to end
        for (int start = i + 1, end = n - 1; start < end; start++, end--) {
            swap(nums, start, end);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i]; // Add data type 'int'
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
