public class Main {
    private int top;
    private int stack_size;
    private int stackArr[];
    
    public ArrayStack(int stack_size) {
        top = -1;
        this.stack_size = stack_size;
        stackArr = new int[this.stack_size];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.stack_size-1);
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stackArr[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        popvalue = stackArr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        peekvalue = stackArr[top];
    }

    public static void main(String[] args) {
        
        ArrayStack(10);
        push(10);
        pop();

    }

}
