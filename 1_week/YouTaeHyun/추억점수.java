class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int i;
		int[] answer = new int[photo.length];
        int result = 0;
           for(i = 0; i < photo.length; i++){
        	   for(int p = 0; p < name.length; p++){
        		   for(int j = 0; j < photo[i].length; j++){
                    if(photo[i][j].equals(name[p]))
                        result += yearning[p];
                }
            }
            answer[i] = result;
            result = 0;
        }
        return answer;
    }
}
