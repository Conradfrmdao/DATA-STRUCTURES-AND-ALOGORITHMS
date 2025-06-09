import java.util.*;

public class SACCO{
    public static void main(String[] args) {
     LinkedList<Transactions> transactions=new LinkedList<>();
     LinkedList<farmer_details>FD=new LinkedList<>();
     HashMap<String,Float> map=new HashMap<>();
     HashMap<String,String> greeting=new HashMap<>();
     int x;  
     Scanner scanner =new Scanner(System.in);
     System.out.println("WELCOME TO THE SACCO SYSTEM!!");
     while (true) { 
       System.out.printf("\n1.CREATE ACCOUNT\n2.DEPOSIT MONEY\n3.WITHDRAW MONEY\n4.CHECK TRANSACTION HISTORY\n5.CHECK BALANCE\n\nPLEASE SELECT SERVICE:");
     while (true) { 
        try {
            x=scanner.nextInt();
            scanner.nextLine();
           switch (x) {
               case 1:
              farmer_details fd=new farmer_details(null, 0, null);
              fd.getacc();
              FD.add(fd);
              map.put(fd.farmer_id, 0f);
              greeting.put(fd.farmer_id, fd.name);
              System.out.println(fd.toString());
               break;
     
               case 2:
               System.out.printf("ENTER FARMER ID :");
               String acc_1=scanner.nextLine();
               if (map.containsKey(acc_1)) {
                String hello= greeting.get(acc_1);
                System.out.println("----HELLO "+ hello+"---");
                System.out.printf("ENTER AMMOUNT TO BE DEPOSITED:");
                   while(true){
                    try {
                        float y=scanner.nextFloat();
                        scanner.nextLine();
                         if(y>0){ float balance=map.get(acc_1);
                          balance=balance+y;
                            map.put(acc_1, balance);
                            transactions.add(new Transactions(acc_1, "DEPOSITED", y));
                            System.out.println("DEPOSIT SUCCESSFUL!!"); }
                         else if(y==0){System.out.println("CANNOT DEPOSIT ZERO(0)");}
                         else{System.out.println("CANNOT DEPOSIT NEGATIVE NUMBERS!!");} break;
                    } catch (Exception e) {
                        scanner.nextLine();
                        System.out.println("\nINVALID INPUT!! TRY AGAIN");
                        System.out.printf("ENTER AMMOUNT TO BE DEPOSITED:");
                                             }
                   }
                 } 
                 else{System.out.println("ACCOUNT DOES NOT EXIST");}
                  break;
     
                  case 3:
                  System.out.printf("ENTER FARMER ID :");
                  String acc_2 = scanner.nextLine();
                  if (map.containsKey(acc_2)) {
                    String hello= greeting.get(acc_2);
                    System.out.println("----HELLO "+ hello+"---");
                    System.out.printf("ENTER AMMOUNT TO BE WITHDRAWN:");
                   while (true) { 
                    try {
                        float u = scanner.nextFloat(); 
                        scanner.nextLine();
                        float balance = map.get(acc_2);
                        if (u <= 0) {
                            System.out.println("CANNOT WITHDRAW ZERO OR NEGATIVE NUMBERS!!");
                        } else if (u > balance) {
                            System.out.println("INSUFFICIENT MONEY");
                        } else {
                            balance = balance - u;
                            map.put(acc_2, balance);
                            transactions.add(new Transactions(acc_2, " WITHDREW", u));
                            System.out.println("WITHDRAW SUCCESSFUL!!");
                        }  break;
                        } catch (Exception e) {
                            scanner.nextLine();
                            System.out.println("INVALID INPUT!! TRY AGAIN");
                            System.out.printf("ENTER AMMOUNT TO BE WITHDRAWN:");
                                                         }
                   }
                  } else {
                      System.out.println("ACCOUNT DOES NOT EXIST");
                  }
                    break;
     
                    case 4:
                    System.out.printf("ENTER FARMER ID :");
                    String acc_3=scanner.nextLine();
                         if (map.containsKey(acc_3)) { 
                            String hello= greeting.get(acc_3);
                            System.out.println("----HELLO "+ hello+"---");
                             boolean found= false;
                          for (int i=(transactions.size()-1); i>=0; i--) {
                             Transactions t= transactions.get(i);
                             if (t.farmer_id.equals(acc_3)) {
                                 System.out.println(t);
                                 found=true;
                             }
                          }  
                          if (!found) {
                              System.out.println("NO TRANSACTIONS FOUND!!");
                          } 
                         }
                         else{ System.out.println("ACCOUNT DOES NOT EXIST");}
                         break;
    
                         case 5:
                         System.out.printf("ENTER FARMER ID :");
                         String acc_4=scanner.nextLine();
                         if (map.containsKey(acc_4)) {
                            String hello= greeting.get(acc_4);
                            System.out.println("----HELLO "+ hello+"---");
                            float e=map.get(acc_4);
                             System.out.println("CURRENT BALANCE IS SHS " +e);
                         } else{ System.out.println("ACCOUNT DOES NOT EXIST");}
                         break;
     
     
               default:
               System.out.println("INVALID SELECTION!!");
               break;
                 
           }break;
           } catch (Exception e) {
            scanner.nextLine();
            System.out.println("INVALID INPUT!! TRY AGAIN");
            System.out.printf("SELECT SERVICE:");
           }
     
     }
 
 
     }
 
 
    } 
    
 }