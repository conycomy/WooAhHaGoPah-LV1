public class Main {
    
    private int que_size;
    private int rear;
    private int front;
    private int queue[];

    public ArrayQueue(int que_size) {
        rear = 0;
        front = 0;
        this.que_size = que_size;
        queue = new int[this.que_size];
    }


    public boolean isEmpty() {//queue에 아무것도 들어있지 않은지 판단하는 함수 
	    return  front == rear; 
    } 

    public boolean isFull() {//queue가 가득 찼는지 판단하는 함수 
	    return  rear == que_size-1;   배열이 0부터 시작되기 때문에 que_size-1을 해주어야 한다.
    } 

    public void push(int value) { 
	    if(isFull()) { 
		    System.out.println("Queue is Full"); 
		    return; 
	    } 
	    queue[rear++] = value; //rear가 위치한 곳에 값을 넣어주고 rear를 증가시킨다. 
    } 

    public int pop() { 
	    if(isEmpty()) { 
	    	System.out.println("Queue is Empty"); 
	    	return -1; 
	    } 
	    int popValue = queue[front++];
	    return popValue; 
    } 

    public int peek() {  //pop()와 달리 큐에서 요소를 제거하지 않고 큐의 맨 앞에 있는 요소를 조회하는 함수	if(isEmpty()) {
		if(isEmpty()) { 
	    	System.out.println("Queue is Empty"); 
	    	return -1; 
	    }  
	    int popValue = queue[front]; // pop: front ++  / peek: front = front
	    return popValue; 
    } 

    public static void main(String[] args) {
        
        ArrayQueue(10);
        push(10);
        pop();
    }

}
