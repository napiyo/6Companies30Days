public class Question14 {
//    https://leetcode.com/problems/minimum-size-subarray-sum/
    public static void main(String[] args) {
        int[] arr = {3,5,6,74,7,4,36,34,2};
        System.out.println(minSubArrayLen(68,arr));
    }

        public static int minSubArrayLen(int target, int[] nums) {

            int ans=Integer.MAX_VALUE;
            int n=nums.length;
            int s=0,e=0;
            int k=0;
            for(e=0;e<n;e++){
                k+=nums[e];
                while(k>=target){
                    k-=nums[s];
                    ans=Math.min(ans,e-s+1);
                    s++;
                }

            }
            return ans==Integer.MAX_VALUE?0:ans;
        }
    }
// naive solution
//         HashMap<Long,Integer> sumHash = new HashMap<>();
//         // sum , last index
//         sumHash.put(0L,-1);
//         long preSum =0;
//         int ans =Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             preSum +=nums[i];
//             if(nums[i] >= target){
//                 return 1;
//             }
//             long req = preSum - target;
//              if(req <0){
//                  sumHash.put(preSum,i);
//                  continue;
//              }
//             // if(req==0){
//             //    ans= Math.min(ans,i+1);
//             // }
//             for(Map.Entry<Long,Integer> entry : sumHash.entrySet()){
//                 if(entry.getKey() <= req){
//                     ans=Math.min(ans,i-entry.getValue());
//                 }
//             }
//              sumHash.put(preSum,i);


//         }
//         // System.out.println(sumHash);
//         return (Integer.MAX_VALUE==ans)?0:ans;
// }
// }
