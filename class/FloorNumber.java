public class FloorNumber {
    public static void main(String[] args) {
    int arr[] = {2, 4, 6, 14, 22, 56, 83, 75};
    int floor = 3;
    int ans = binarySearch(arr, floor);
    System.out.println(ans);
}

    static int binarySearch(int arr[], int floor){
        if(floor<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(floor>arr[mid]){
                start = mid + 1;
            }

            else if (floor<arr[mid]){
                end = mid - 1;
            }

            else{
                return mid;
            }
        }
        return end;
    }
}
