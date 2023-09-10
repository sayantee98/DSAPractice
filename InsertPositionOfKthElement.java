public class InsertPositionOfKthElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 67;
        int ans = InsertPosition(arr, target);
        System.out.println(ans);
    }
    static int InsertPosition (int[] arr, int target){
            int start = 0;
            int end = arr.length -1;
            if (target <= arr[0]){
                return 0;
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
                    return mid;
                }
            }
            return end+1;
        }
    }


