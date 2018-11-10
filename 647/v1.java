class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int array_size = nums.length;
        if (array_size <= 1)
            return array_size;
         int max_len = 1;
        for ( int i = 0; i < array_size-1; i++)
        {
            int counter = 1;
            for ( int j = i; j < array_size-1; j++)
            {
                if (nums[j] < nums[j+1])
                {
                    counter++;
                }
                else
                {
                    break;
                }
            }
            if (counter > max_len) max_len = counter;
        }
        return max_len;
    }
}


