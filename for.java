
import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b =0;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = b + a;
        }
        System.out.println(b);
        
        
        
    }  
}