public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {12, 45 , 5 , 44, 67, 64, 78};
        int target = 44;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element= arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
