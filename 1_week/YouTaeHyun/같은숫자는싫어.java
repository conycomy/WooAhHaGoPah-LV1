import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int[] temp = new int[1000000];
        int previous = 10;
        int a = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(previous != arr[i]){
                temp[a] = (arr[i]);
                previous = arr[i];
                a++;
                index++;
            }
            else if(previous == arr[i]){
                continue;
            }
        }
        answer = new int[index];
        for(int j = 0; j < index; j++){
            answer[j] = temp[j];
        }
        return answer;
    }
}
