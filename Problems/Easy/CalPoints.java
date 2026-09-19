package Problems.Easy;

import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] operations) {
        // ["5","2","C","D","+"] | Output = 30 -> (5 + 10 + 15)
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+") && stack.size() >= 2) {
                int top = stack.pop();
                int second = stack.pop();
                int result = top + second;
                // ----------
                stack.push(second);
                stack.push(top);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(op));

            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

}
