/*
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.
Examples:
Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation: The subarray from index 0 to index 4 has the largest sum = 15
Input: nums = [-2, -3, -7, -2, -10, -4]
Output: -2
Explanation: The element on index 0 or index 3 make up the largest sum when taken as a subarray
*/
class DSA1 {
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