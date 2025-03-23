
import java.util.Stack;

public class stack_operations {
    
    public static void main(String[] args) {
        Stack<String> names =new Stack<>();
        
        // DEMOSTRATING PUSH
        names.push("CONRAD");
        names.push("ADAM");
        names.push("SMITH");
        names.push("SOLOMON");

        // DEMOSTRATING POP
        names.pop(); //deletes top element
         
        // DEMOSTRATING PEEK
        System.out.println(names.peek()); //RETURNS TOP ELEMENT

        System.out.println(names);

    }
}
