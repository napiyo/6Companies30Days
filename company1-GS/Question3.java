public class Question3 {
//    Count the subarrays having product less than k
//    https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#

    public static void main(String[] args) {
       long[] a = {1, 2, 3, 4};
       long k =10;
        // better2 solution
        if (k <= 1) {
//            return 0;
            System.out.println(0);
            return;
        }
        long mul = 1;
        int left = 0;
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            mul *= a[i];
            while (mul >= k && left <= i) {
                mul /= a[left];
                left++;
            }
            ans += i - left + 1;
        }
        System.out.println(ans);
//        return ans;
        //better approach
        //   int ans=0;
        // int count=0;
        //   long  mul=1;
        // // int end;

        // for(int i=0;i<a.length;i++){
        //     if(mul*a[i]<k){
        //         mul*=a[i];
        //         count++;

        //     }
        //     else{

        //         break;
        //     }

        // }
        // ans+=count;
        // for(int j=1;j<a.length;j++){
        //     mul/=a[j-1];
        //     count--;

        //     if(mul>=k && count >0){
        //          while(mul >= k){
        //              count--;
        //              mul/=a[j+count];
        //              if(count==0){
        //                  mul=1;
        //                  break;
        //              }
        //     }

        //     }
        //     else{
        //          if(count<=0){
        //         mul=1;
        //              count=0;

        //     }
        //         while(j+count<a.length){
        //             if(mul*a[j+count] < k){
        //                 mul*=a[count+j];
        //                 count++;
        //             }
        //             else{
        //                 break;
        //             }
        //         }
        //     }

        //     ans+=count;
        // }
        // return ans;


        // Naive solution

        // int ans=0;
        // for(int i=0;i<a.length;i++){
        //     long count =0;
        //     long mul = 1;
        //     for(int j=i;j<a.length;j++){
        //         mul *= a[j];
        //         if(mul<k){
        //             count++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     ans+=count;

        // }
        // return ans;
    }
}