class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int mid = 0;
        int start = 0;
        int end = len-1;
        while (start <= end)
        {
            mid = (start + end)/2;
            if (target == nums[mid])
            {
                return mid;
            }
            else if (target > nums[mid])
            {
                start = mid+1; /*move start point of searching*/
            }
            else
            {
                end = mid-1; /*move end point of searching*/
            }
            
        }
        return -1;
    }
}
