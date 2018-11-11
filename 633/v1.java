class Solution {
    public boolean judgeSquareSum(int c) {
        boolean res = false;
        int max_v = (int)Math.sqrt(c);
        int min_v = 0;
        while (min_v <= max_v)
        {
            int sum = min_v*min_v + max_v*max_v;
            if (c > sum)
            {
                min_v++;
            }
            else if (c < sum)
            {
                max_v--;
            }
            else
            {
                /*find a match*/
                return true;
            }
        }
        return res;
    }
}

/*mistake
for the matching condition, instead of directly return, just update the res result.
this causing the loop to be infinite.
How to avoid?
think about ending condition for the while loop under all conditions
*/
