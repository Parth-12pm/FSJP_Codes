import java.util.Stack;

public class Exp_5a {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        System.out.println("Pushing Elements into Stack : ");
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack ELements :" + s);

        System.out.println("Popping a ELement from Stack : ");
        s.pop();

        System.out.println("Stack ELements :" + s);

        System.out.println("Top Element of Stack : " + s.peek());
        System.out.println("Stack Capacity : " + s.capacity());

    }
}