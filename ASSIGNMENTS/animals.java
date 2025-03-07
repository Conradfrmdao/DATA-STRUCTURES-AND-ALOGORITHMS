
import java.util.Scanner;
class animals{

    public static void main(String[] args){
        int i;
        String[] d=new String[1000];
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF DOMESTIC ANIMALS");
        int x=input.nextInt();
        System.out.printf("ENTER NUMBER THE %d DOMESTIC ANIMALS\n",x);
        
        for( i = 0; i <= x; i++) 
        {
        d[i]=input.nextLine(); 
        };
        
        System.out.println("ENTER NUMBER OF WILD ANIMALS");
        int y=input.nextInt();
        System.out.printf("ENTER NUMBER THE %d WILD ANIMALS\n",y);
        String[] w=new String[1000];
        for( i = 0; i <= y; i++) 
        {
        w[i]=input.nextLine(); 
        };
        System.out.println("----------------------------------------");
        System.out.printf("--TOTAL NUMBER OF ANIMALS= %d\n",(x+y));
        System.out.println("--BELOW IS THE LIST OF ANIMALS--");
        for ( i = 0; i <= (x); i++) {
            System.out.printf(d[i]+"\n");
        };
        for ( i = 0; i <= (y); i++) {
            System.out.printf(w[i]+"\n");
        };
        System.out.println("----------------------------------------");
       }
}