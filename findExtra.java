//https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=1&sortBy=submissions
//Find the index of the extra element present in the first array.
public class findExtra {
    public static void main(String[] args) {
        int[] a = {5,6,78,100,4566};
        int[] b = {5,6,100,4566};
        int target = 5;
        int ans = findExtra(a,b,target);
        System.out.println(ans);
    }
    static int findExtra(int a[], int b[], int n){
        int a1 = sum(a,n);
        int b1 = sum(b,n);
        int target = a1-b1;
        return (binarySearch(a,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int sum (int[] arr, int n){
        int sum =0;
        for (int i=0;i<arr.length;i++ ){
            sum = sum + arr[i];
        }
        return sum;
    }
}
