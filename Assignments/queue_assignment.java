/*  A printer can only print one document at a time. When multiple print requests 
come in, they should be stored in a queue and printed in the order they were 
received (First In, First Out - FIFO)*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_assignment {
    public static void main(String[] args) {
        Queue<String> Document=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        while (true) { 
            System.out.println("--WELCOME TO PRINT WORLD--");
            System.out.printf("SELECT SERVICE\n1-ADD DOCUMENT\n2-PRINT AND DELETE DOCUMENT FROM QUEUE\n3-CHECK IF QUEUE LIST IS EMPTY\n4-PRINT DOCUMENT LIST\n");
            int w;
            w=scanner.nextInt();
            scanner.nextLine();
            if(w==1){
                System.out.println("ENTER DOCUMENT"); 
                String doc=scanner.nextLine();
                Document.add(doc);
                System.out.println("DOCUMENT ADDED TO QUEUE"); 
            }
            if(w==2){       
                System.out.println(Document.poll()+" HAS BEEN PRINTED AND REMOVED FROM THE QUEUE");
                System.out.println("DOCUMENT IN QUEUE IS DELETED");
            }
            if(w==3){ 
                if(Document.isEmpty()){System.out.println("QUEUE IS EMPTY");}else{System.out.println("QUEUE IS NOT EMPTY");}
            }
            if(w==4){ 
               System.out.println(Document);
            }
            
        }

    }
}
