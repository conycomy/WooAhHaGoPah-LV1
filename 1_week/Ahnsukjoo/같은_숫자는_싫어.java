import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int k=0;
        Stack<Integer> stack = new Stack <>();
        Stack<Integer> stack2 = new Stack <>();
        for(int i = 0 ; i < arr.length ; i++ ){
            stack.push(arr[i]);
            if(i > 0 && arr[i] == arr[i-1]){
                stack.pop();
            }
        }
        while(stack.size()!=0){
            stack2.push(stack.pop());
        }
        int[] answer = new int [stack2.size()];
        while(stack2.size()!=0){
            answer[k] = stack2.pop();
            k++;
        }

        return answer;
    }
}
