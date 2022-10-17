import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int x=n, suma = 0;
        while(x>0){
            suma+=x%10;
            x/=10;
        }
        return suma;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = in.nextInt();
        for(int i=1; i<n; i++){
            int suma=sumaCifara(i);
            if(i%suma==0){
                System.out.println(i);
            }
        }
    }
}