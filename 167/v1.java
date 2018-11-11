class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index_l = new int[2];
        for (int i = 0; i < numbers.length; i++)
        {
            int search_v = target - numbers[i];
            int t_index = binary_search(numbers, search_v);
            if (t_index != -1)
            {
                index_l[0] = i+1;
                index_l[1] = t_index+1;
                return index_l;
            }

        }
        return index_l;
    }
    public int binary_search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        while (start <= end)
        {
            int mid_index = (start + end)/2;
            int mid_v = nums[mid_index];
            if (target == mid_v)
            {
                return mid_index; /*return index of the matching value*/
            }
            else if (target < mid_v)
            {
                end = mid_index-1;
            }
            else
            {
                start = mid_index+1;
            }
        }
        return -1; /*in case no result is found, return -1*/
    }
}


/*
question:
1. can this array has the repeated values?
2. Note: index is not zero-based.
3. If question is vague, should be able to ask if can use the same element twice

time complexity:
o(nlogn)

mistake:
because of question1, fail to think the scenario where array has repeated values
*/


