///WAP to find the floor of a number
public class floorOfaNum {
    public static void main(String[] args) {
        int[] arr = {-2,3,4,5,6};
        int target =1;
        int ans = floor(arr, target);
        System.out.println("The floor of "+target+" is "+ans);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if (target <= arr[0]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid +1;
            }
            else{
                return arr[mid-1];
            }
        }
        return arr[end];
    }
}
