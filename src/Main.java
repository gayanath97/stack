public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);  
        stack.display();
        System.out.println();
        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());
        stack.display();
        System.out.println();
        System.out.println("Peeked item: " + stack.peek());
        stack.display();
    }
}