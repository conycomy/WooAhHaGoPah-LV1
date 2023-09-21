import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        int i=1;
        int j=0;
        
        queue.add(arr[0]);
        
        while(i<arr.length){
            if(arr[i] != arr[i-1]){
                queue.add(arr[i]);
            }
            i++;
        }
        
        int[] answer = new int[queue.size()];
        
        while(!queue.isEmpty()){
            
            answer[j] = queue.poll();
            j++;
                
        }
        
        return answer;
    }
}
