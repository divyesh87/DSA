class Solution {
    public static void main(String args[]) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return nums[start];
    }
}