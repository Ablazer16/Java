import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        while(n>0){
            int r = n%10;
            n = n/10;
            a = a * 10 + r;  
        }
        System.out.println(a);
    }
}
