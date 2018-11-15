class Solution {
    public boolean isValid(String s) {
        boolean res = false;
        Stack<Character> stack = new Stack<Character>();
        for (char c: s.toCharArray())
        {
            /*must push for matching if it is below character*/
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if (!stack.empty() && ismatch(stack.peek(), c))
            {
                stack.pop();
            }
            else
            {
                /*if it is char (, {, [, and not matching with the top element of the 
                stack, it must not valid*/ 
                /*when you add more restriction and think more details, the time efficiency can be improved*/
                return false;
            }
        }

        return stack.empty();
    }
    boolean ismatch(char c1, char c2)
    {
        boolean res = false;
        if (c1 == '[' && c2 == ']') 
        {
            res = true;
        }
        else if (c1 == '{' && c2 == '}')
        {
            res = true;
        }
        else if (c1 == '(' && c2 == ')')
        {
            res = true;
        }
        else
        {
            res = false;
        }
        return res;
            
    }
}

/*time complexity:
o(n)
*/
