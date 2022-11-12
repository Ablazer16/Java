import java.util.Scanner;

public class Ocurrence {
    public static void main(String[] args) {
        int num = 343387834;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(num>0){
            int r = num%10;
            if(r==n){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
