import java.util.Scanner;
public class Tutorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a > 0) {
            System.out.println("positif");
        }else if(a == 0){
            System.out.println("nol");
        }else{
            System.out.println("negatif");
        }
        
        
    }
}