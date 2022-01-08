import java.util.HashMap;
import java.util.Map;

public class Question15 {
    public static void main(String[] args) {
        int[] nums = {2,46,44,4};
        int k =2;
        System.out.println(canPair(nums,k));

    }
    public static boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length%2 !=0) return false;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i]%k,hash.getOrDefault(nums[i]%k,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getKey()*2==k ) {
                if(entry.getValue()%2 !=0 ) return false;}
            else if(entry.getKey()==0 ){
                if(entry.getValue()%2 !=0)
                    return false;}
            else{
                int key = entry.getKey();
                if(entry.getValue() != hash.get(k-key)) return false;
            }
        }
        return true;
    }
}

