class Solution {
    public boolean backspaceCompare(String S, String T) {
        /*using stack*/
        boolean res = true;
        Stack<Character> ss = new Stack<Character> ();
        Stack<Character> tt = new Stack<Character> ();
        for (char s: S.toCharArray() )
        {
            if (s == '#' && !ss.empty()) ss.pop();
            else if (s == '#') continue;
            else ss.push(s);
        }
        for (char t: T.toCharArray() )
        {
            if (t == '#' && !tt.empty()) tt.pop();
            else if (t == '#') continue;
            else tt.push(t);
        }
        while (!ss.empty() && !tt.empty())
        {
            if (ss.peek() ==  tt.peek())
            {
                ss.pop();
                tt.pop();
            }
            else
            {
                return false;
            }
        }
        if (!( ss.empty() && tt.empty() ) )  
            return false;
        return res;
    }
    /*
    assume S and T can contain lower case char and #, but # is not mandatory to be present
    */
}
