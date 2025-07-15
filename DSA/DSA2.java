/*
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/
class DSA2 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + nums[j];
                max = Math.max(max,sum);
            }

        }
        return max;
    }
    public static void main (String args[]){
        int [] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        DSA1 obj = new DSA1();
       int maximum = obj.maxSubArray(nums);
       System.out.println("maximum is " + maximum );
    }
}
