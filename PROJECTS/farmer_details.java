
import java.util.Scanner;



public class farmer_details {
    String name;
    int age;
    String Address;
    static int count=0;
    String farmer_id;
    Scanner scanner=new Scanner(System.in);
  
    void getacc(){
        System.out.printf("ENTER FARMER'S NAMES: ");
                try {
                    name=scanner.nextLine();
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("INVALID INPUT!!");
                }
        
        System.out.printf("ENTER FARMER'S AGE: ");
                try {
                    age=scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("INVALID INPUT!!");
                }
        System.out.printf("ENTER FARMER'S ADDRESS: ");
                try {
                    Address=scanner.nextLine();
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("INVALID INPUT!!");
                }
    }
    farmer_details(String n,int a,String Ads){
        name=n;
        age=a;
        Address=Ads;
        farmer_id="F"+String.format("%04d",count++);
    }
    @Override
    public String toString(){
        return "\nACCOUNT CREATED\n" + "NAME:"+name+"\nAGE: "+age+"\nADDRESS: "+Address+"\nPLEASE TAKE NOTE OF THE FARMER ID BELOW\n"+"FARMER ID :"+farmer_id;
    }

    
}
