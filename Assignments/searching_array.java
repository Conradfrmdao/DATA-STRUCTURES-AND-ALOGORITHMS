
import java.util.Scanner;

public class searching_array {
    public static void main(String[] args) {
        int[] x={10,20,30,40,50,60,70,80};
        int element;
        System.out.println("ENTER ELEMENT TO BE SERACHED");
        Scanner scanner=new Scanner(System.in);
        element=scanner.nextInt();
        for (int i = 0; i < 8; i++) {
            if (x[i]==element) {
                System.out.println("ELEMENT FOUND");
            }
        }
        //CODE WILL TERMINATE IF ELEMENT IS NOT FOUND
        
    }
}
