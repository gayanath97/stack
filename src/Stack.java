public class Stack {
    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack
    //-------------------------------------------------------------------------
    public Stack(int s) {
        this.stackData = new int[s];
        this.maxSize = s;
        this.top = -1;
    }
    public boolean isEmpty() {
        if(this.top == -1) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull() {
        if(this.top == this.maxSize - 1) {
            return true;
        }else {
            return false;
        }
    }
    public void push(int item) {
        if(this.isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        this.top++;
        this.stackData[this.top] = item;
    }
    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int item = this.stackData[this.top];
        this.top--;
        return item;
    }
    public int peek() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return this.stackData[this.top];
    }
    public void display() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        for(int i = this.top; i >= 0; i--) {
            System.out.print(this.stackData[i] + " ");
        }
    }
}
