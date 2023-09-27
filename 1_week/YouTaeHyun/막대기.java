public static void main(String[] args) {
		//int[] stack = {5, 5, 4, 3, 2, 1};
		int[] stack = {6, 9, 7, 6, 4, 6};
		int check;
		int max;
		int count = 1;
		check = stack[stack.length - 1];
		for(int i = stack.length - 1; i >= 0; i--) {
			if(stack[i] > check) {
				check = stack[i];
				count++;
			}
			else if(stack[i] <= check) {
				continue;
			}
		}
		
		System.out.println(count);
	}
