class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int res = x^y;
        for (int i = 1; i <=32; i++)
        {
            int bit = res & 1;
            if (bit == 1) distance++;
            res = res >> 1;
        } 
        return distance;
    }
}
