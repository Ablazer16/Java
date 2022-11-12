public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] arr = {18,7,36,172,5,1462};
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int [] arr){
        int count = 0;
        for (int num : arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int e = digits(num);
        if(e%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if(num<0){
            num *= -1;
        }
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
