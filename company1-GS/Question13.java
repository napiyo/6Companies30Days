import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/decode-the-string2444/1#
public class Question13 {
    public static void main(String[] args) {
        System.out.println(decodedString("3[a3[b]1[ab]]"));
    }
    static String decodedString(String s){
        // code here
        Stack<StringBuilder> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int i=0;
        int count =0;
        StringBuilder curr = new StringBuilder();
        while(i<s.length()){
            int n = s.charAt(i) - '0';

            if(n > -1 && n<10){
                count=count*10+n;
            }
            else if(s.charAt(i)=='['){
                num.push(count);
                StringBuilder sb = new StringBuilder(curr);
                str.push(sb);
                curr.setLength(0);
                count=0;
            }
            else if(s.charAt(i)==']'){
                int r = num.pop();
                String c = curr.toString().repeat(r);
                curr.setLength(0);
                StringBuilder ss = str.pop();
                c = ss.toString()+c;
                curr = new StringBuilder(c);
            }
            else{
                curr.append(s.charAt(i));
            }
            i++;
        }
        String res = curr.toString();
        return res;
    }
}

