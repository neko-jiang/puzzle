class Solution {
    public int[] twoSum(int[] nums, int target) {
       /*use hash map to store the index and its value */
        Map <Integer, Integer> index_t = new HashMap <> ();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            /*need to check before updating hash table, otherwise, will override the 
            value of hash table */
            int cur_v = nums[i];
            int sear_v = target - cur_v;
            if (index_t.containsKey(sear_v) ) 
            {
                return new int[] {index_t.get(sear_v),i};
            }
            index_t.put(cur_v, i);
        }
        return result;
    }
}

    /*
    without extra memory, i don't think we can achieve o(n) solution
    some ideas:
    sort the array and then turn into the problem of Two Sum II - Input array is sorted    
    
    question:
    1. Can the array has duplicate values? yes

mistake:
debug for a long time, the array boundary is wrong. forget to check the last value of the array element. 
Need to be extra careful with the start and an end point of an array. 

time complexity:
o(n)
space complexity:
o(n)

trade space for time with hashtable

thinking pattern:
if the component exists, we need to look up its index. what is the best way to maintain a mapping of each element in the array of its index? A hash table. 
A hash table supports fast look up in near constant time. If a collision occurred, a look up could degenerate to o(n) time. but look up in hash table should be amortized o(1) time as long as the hash function was chosen carefully
    */
