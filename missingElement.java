// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
// Find the missing element in the array of range 0 to N, the array is of length N-1
public class missingElement {
    public static void main(String[] args) {
        int arr[] = {6,1,2,8,3,4,7,10,5};
        int n = 10;
        int ans = missingElement(arr,n);
        System.out.println(ans);
    }
    static int missingElement (int[] arr, int n){
        int sum1 = sum(n); int ans;
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        ans = sum1-sum;
        return ans;
    }
    static int sum (int N){
        int sum = (N*(N+1))/2;
        return sum;
    }
}
