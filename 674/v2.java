class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int array_size = nums.length;
        if (array_size <= 1)
            return array_size;
        int max_len = 1;
        int counter = 1; /*keep track of the position of the continuous increasing sqeuence */ 
        for ( int i = 0; i < array_size -1; i++)
        {
            if (nums[i] < nums[i+1]) 
            {
                counter++;
            }
            else
            {
                counter = 1;  /*reset counter*/
            }
            if ( counter > max_len ) max_len = counter;
        }
        return max_len;
    }
}
/*
mistakes:
1. counter works better than have a variable to keep track of the start point of this sub array.
2. clear logic matters. the if condition inside the loop is a mess before. 
3. when you make a hack to make things work, remember to change it back. Debugging the test failure, and releasize it does not work because returns the hack value when add to debug. 

time complexity: o(n)

space complexity: o(1)
self thinking?
Y
*/

