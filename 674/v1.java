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

/*
mistakes:
1. variable name. change variable name and forget to apply the change to every places used. For example from array to array_size, and one place still use array. This cause compile failed. 
2. loop. 
A. How many loops are needed? Not able to forsee clearly before writing
B. Counters inside the loops. The initial value of "counter" is wrongly determined. Previously sets to 0. 
C. Loop boundary. The inner loops starts from the current value of outside loop and ending with array.size-1

time complexity:
o(n^2)
self-thinking?
Y
*/
