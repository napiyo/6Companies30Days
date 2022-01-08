public class Question4 {
//    Run Length Encoding
//    https://practice.geeksforgeeks.org/problems/run-length-encoding/1/
    public static void main(String[] args) {
        String str = "aaaabbbcccc";
        String s= "";
        int count=1;
        char curr = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) != curr){
                s+=curr+String.valueOf(count);
                curr=str.charAt(i);
                count=1;

            }
            else{
                count++;
            }
        }
        s+=curr+String.valueOf(count);
//        return s;
        System.out.println(s);
    }
}
