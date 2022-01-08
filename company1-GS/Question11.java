import java.util.Arrays;

public class Question11 {
//    Find Missing And Repeating
//    https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/#
    public static void main(String[] args) {
        int[] arr={4,5,3,4,1};
        //repeated , missing
        System.out.println(Arrays.toString(findTwoElement(arr,arr.length)));
    }
   static int[] findTwoElement(int arr[], int n) {


        // Naive solution
        int[] hel = new int[n+1];
        int[] ans = new int[2];

        for(int i=0;i<arr.length;i++){
            hel[arr[i]]++;
        }
        for(int i=1;i<hel.length;i++){
            if(hel[i]==0){
                ans[1]= i;
            }
            if(hel[i] >1){
                ans[0] = i;
            }
        }
        return ans;
    }
}
