public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isarmstrong(int i){
        int r;
        int sum=0;
        int a =i;
        while(a!=0){
            r=a%10;
            sum=sum+r*r*r;
            a/=10;
        }
        return sum==i;
    }
}
