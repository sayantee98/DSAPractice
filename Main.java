//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};
        int k = 2;
        int ans = countPairs(arr,k);
        System.out.println(ans);
    }
    static int countPairs(int[] arr, int k) {
        int count =0;
        for (int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    int pro  = i*j;
                    if(pro%k==0){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
}
