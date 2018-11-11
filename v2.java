class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*using two pointers*/
        int start = 0;
        int end = numbers.length - 1;
        int[] arr = new int[2];
        while (start <= end)
        {
            if (target == numbers[start] + numbers[end])
            {
                arr[0] = start + 1;
                arr[1] = end + 1;
                return arr;
            }
            else if (target < numbers[start] + numbers[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return arr;
    }
    
}


/*
mistake:
1. end index; forget to -1 after acquiring the size of the array
