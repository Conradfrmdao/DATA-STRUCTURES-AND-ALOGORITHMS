
import java.util.ArrayList;
public class delete_array {
   public static void main(String[] args) {
    ArrayList<String> name=new ArrayList<>();
    name.add("CONRAD"); name.add("TRIX");name.add("TIMOTHY");name.add("ADAM");name.add("TIF");name.add("TONY");
    System.out.println(name);
    String element=name.remove(5); //removes last element basing on the last index
    System.out.println("REMOVED ELEMENT:"+element);//the remove method also returns the removed element
    name.remove(2); //removed element in the middle
    name.remove(0);// removed the first element
    System.out.println("UPDATED ARRAY:"+name);
    
   }
  
}
