import java.util.*;
public class SACCO{
    public static void main(String[] args) {
     LinkedList<Transactions> transactions=new LinkedList<>();
     HashMap<String,Float> map=new HashMap<>();
     int x;  
     Scanner scanner=new Scanner(System.in);
     System.out.println("WELCOME TO THE SACCO SYSTEM!!");
     while (true) { 
       System.out.printf("\n1.CREATE ACCOUNT\n2.DEPOSIT MONEY\n3.WITHDRAW MONEY\n4.CHECK TRANSACTION HISTORY\n5.CHECK BALANCE\n\nPLEASE SELECT SERVICE:");
       x=scanner.nextInt();
       scanner.nextLine();
       switch (x) {
           case 1:
           System.out.printf("ENTER FARMER ID TO BE CREATED:");
           String acc=scanner.nextLine();
           if (map.containsKey(acc)) {
               System.out.println("ACCOUNT ALREADY EXISTS!!");
           }else{map.put(acc, 0f); System.out.println("ACCOUNT CREATED!!");}
           break;
 
           case 2:
           System.out.printf("ENTER FARMER ID :");
           String acc_1=scanner.nextLine();
           System.out.printf("ENTER AMMOUNT TO BE DEPOSITED:");
           float y=scanner.nextFloat();
           scanner.nextLine();
           if (map.containsKey(acc_1)) {
             if(y>0){ float balance=map.get(acc_1);
              balance=balance+y;
                map.put(acc_1, balance);
                transactions.add(new Transactions(acc_1, "DEPOSITED", y));
                System.out.println("DEPOSIT SUCCESSFUL!!");}
             else if(y==0){System.out.println("CANNOT DEPOSIT ZERO(0)");}
             else{System.out.println("CANNOT DEPOSIT NEGATIVE NUMBERS!!");}
             } 
             else{System.out.println("ACCOUNT DOES NOT EXIST");}
              break;
 
              case 3:
              System.out.printf("ENTER FARMER ID :");
              String acc_2 = scanner.nextLine();
              System.out.printf("ENTER AMMOUNT TO BE WITHDRAWN:");
              float u = scanner.nextFloat(); 
              scanner.nextLine();
              if (map.containsKey(acc_2)) {
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
                  }
              } else {
                  System.out.println("ACCOUNT DOES NOT EXIST");
              }
                break;
 
                case 4:
                System.out.printf("ENTER FARMER ID :");
                String acc_3=scanner.nextLine();
                     if (map.containsKey(acc_3)) { boolean found= false;
                      for (int i=(transactions.size()-1); i>=0; i--) {
                         Transactions t= transactions.get(i);
                         if (t.farmer_id.equals(acc_3)) {
                             System.out.println(t);
                             found=true;
                         }
                      }  
                      if (!found) {
                          System.out.println("NO TRSACTIONS FOUND!!");
                      } 
                     }
                     else{ System.out.println("ACCOUNT DOES NOT EXIST");}
                     break;

                     case 5:
                     System.out.printf("ENTER FARMER ID :");
                     String acc_4=scanner.nextLine();
                     if (map.containsKey(acc_4)) {
                      float e=map.get(acc_4);
                         System.out.println("CURRENT BALANCE IS SHS " +e);
                     }
                     break;
 
 
           default:
           System.out.println("INVALID SELECTION!!");
           break;
              
       }
 
 
 
     }
 
 
    } 
 }