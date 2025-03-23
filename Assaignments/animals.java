
import java.util.Scanner;
class animals{

    public static void main(String[] args){
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF DOMESTIC ANIMALS");
        int x=input.nextInt();
        String[] d=new String[x];
        System.out.printf("ENTER THE %d DOMESTIC ANIMALS\n",x);
        input.nextLine(); 
        for( i = 0; i < x; i++) 
        {
        d[i]=input.nextLine(); 
        };
        
        System.out.println("ENTER NUMBER OF WILD ANIMALS");
        int y=input.nextInt();
        input.nextLine(); 
        String[] w=new String[y];
        System.out.printf("ENTER THE %d WILD ANIMALS\n",y);
        for( i = 0; i < y; i++) 
        {
        w[i]=input.nextLine(); 
        };
        System.out.println("----------------------------------------");
        String[] p=new String[x+y];
        for( i = 0; i < x; i++) 
        { p[i]=d[i]; };
        for( i = 0; i < y; i++) 
        { p[x+i]=w[i]; };
        
        for( int k= 0; k< (x+y); k++) 
        { System.out.println(p[k]);};
       

        System.out.println("----------------------------------------");
       }
}