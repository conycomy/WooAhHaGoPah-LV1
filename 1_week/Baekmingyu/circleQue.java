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

    public Boolean isFull() {
	    return (rear + 1) % que_size == front;
    }

    public Boolean isEmpty() {
	    return rear == front;
    }

    public void push(int value){
	    if (isFull()) {
		    System.outprintln(“Queue is Full”);
		    return;
	    }
	    queueArray[rear] = value;
	    rear++;
	    rear %= que_size; //rear의 값을 재조정 	계속 증가 하다 보면 que_size를 넘어가기 	때문에
    }

    public int pop() {
	    if(isEmpty()){
		    System.out.println(“Que is Empty”);
		    return -1;
	    }
	    int popvalue = queueArray[front];
	    front++;
	    front %= que_size;
	    return popvalue;
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
