public class CelingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 14, 22, 56, 83, 75};
        int celing = 81;
        int ans = binarySearch(arr, celing);
        System.out.println(ans);
    }

    static int binarySearch(int arr[], int celing){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(celing>arr[mid]){
                start = mid + 1;
            }

            else if (celing<arr[mid]){
                end = mid - 1;
            }

            else{
                return mid;
            }
        }
        return start;
    }
}
