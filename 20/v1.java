/*primitive types such as char cannot be used as type parameters in java. You need to use the wrapper type. 

There are 8 primitive types:
byte, short, int, long, char, float, double, boolean
*/


class Solution {
    public boolean isValid(String s) {
        boolean res = false;
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        /*build matching hash table */
        HashMap <Character, Character> h = new HashMap<Character, Character>();
        h.put('(',')');
        h.put('{','}');
        h.put('[',']');
        int i = 0;
        for ( char c: s.toCharArray())
        {
            if (stack.empty())
            {
                stack.push(c);
            }
            else
            {
                char p = stack.peek();
                if (h.containsKey(p) && h.get(p) == c)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        }
        if (stack.empty()) res = true;
        return res;
    }
}


/*mistake:
1. when it comes to string, thing become tricky. need to consider different scenarios.
for example, when stack is empty, you can not use peek api, otherwise there will be exceptions. 
2. lots of scenarios are not cleared before wrting. For example, what if the string is match. what is counted as match?
3. fail to handle this test case :"[](", stack will pop up all elements when reach "]" (stack become empty), need to push ( now.

*/
