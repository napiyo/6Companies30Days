import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        String[] strs = {"act","god","cat","dog","tac"};
        System.out.println(Anagrams(strs));

    }
    public static List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,Integer> hash = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<string_list.length;i++){
            char[] tempChar =  string_list[i].toCharArray();
            Arrays.sort(tempChar);
            String t = String.valueOf(tempChar);
            if(hash.containsKey(t)){
                ans.get(hash.get(t)).add(string_list[i]);

            }
            else{
                int s = ans.size();
                List<String> curr = new ArrayList<>();
                curr.add(string_list[i]);
                hash.put(t,s);
                ans.add(curr);
            }

        }
        return ans;
    }
}
