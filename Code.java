import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        int N;
        int r;
        int facN=1;
        int facr=1;
        int faca=1;
        int Cnr;
        int i;

        System.out.print("Input element no of cluster = ");
        N=input.nextInt();
        System.out.print("Input element no of group = ");
        r=input.nextInt();

        int a=N-r;

        for(i=1;i<=N;i++){
            facN*=i;
            
        }
        System.out.println("N! = "+facN);

        for(i=1;i<=r;i++){
            facr*=i;
            
        }
        System.out.println("r! = "+facr);

        for(i=1;i<=a;i++){
            faca*=i;
            
        }
        System.out.println("(N-r)! = "+faca);

        Cnr=facN/facr/faca;
        System.out.println("C(N,r) = "+Cnr);

        
    }
    
}
