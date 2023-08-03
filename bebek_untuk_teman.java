import java.util.Scanner;
public class Tutorial {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c,d;
        c = a%b;
        d = a/b;
        System.out.println("masing-masing "+d);
        System.out.println("bersisa "+c);
    }
}