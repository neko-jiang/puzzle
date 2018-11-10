class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        int size1 = a.length();
        int size2 = b.length();
        int max_len  = -1;
        if (size1 <= size2) max_len = size2;
        else max_len = size1;
        return max_len;
    }
}
