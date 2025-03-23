
import java.util.ArrayList;

// WRITE CODE TO INSERT AN ELEMENT ENTERED BY USER INTO AN ARRAY
public class insert_element {
            public static void main(String[] args) {
              ArrayList<Integer> x=new ArrayList<>();
                //adding elements 
                x.add(20);   
                x.add(30);  
                x.add(40);
                x.add(50);
                System.out.println(x); //automatically adds an element after another following your order

                x.add(2,100); //adding the element anywhere in the array
                System.out.println(x);
                System.out.println(x.get(3)); //40 shifts to index 3 because we added 100 in its previous position
            }
}
