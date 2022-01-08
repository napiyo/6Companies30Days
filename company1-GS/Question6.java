public class Question6 {
    //    1071. Greatest Common Divisor of Strings
//    https://leetcode.com/problems/greatest-common-divisor-of-strings/
    public static void main(String[] args) {

        System.out.println(gcdOfStrings("ABAB","ABABAB"));
    }

    private static String gcdOfStrings(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();
        if (size2 > size1) return gcdOfStrings(str2, str1);
        if (size1 == size2) {
            if (str1.equals(str2)) return str1;
            else return "";
        }
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        } else return "";
    }
}
        //naive solution
//        String x = "";
//        int n = str1.length();
//        int m = str2.length();
//        // if(!(n%2==m%2)){
//        //     return x;
//        // }
//        if (n > m) {
//            x = str2;
//            if(check(x,str1)) {
//                System.out.println(x);
//                return;
//            }
//            String basic = find(x);
//            String curr = "";
//            while (basic.length() <= x.length()/2+1 && check(basic,str1)){
//                curr=basic;
//                basic+=basic;
//            }
//            System.out.println(curr);
//            return;
//
//        } else {
//
//            if(check(str1,str2)) {
//                System.out.println(str1);
//                return;
//            }
//            String basic = find(str1);
//            x=basic;
//            String curr = "";
//            while (basic.length() <= str1.length()/2 ){
//                if (check(basic,str2) && check(basic,str1))curr=basic;
//                basic+=x;
//            }
//            System.out.println(curr);
//            return;
//
//        }
//
//
//
//    }
//
//    private static boolean check(String pat,String str){
//        for(int i=0;i<str.length();i=i+pat.length()){
//            if(!(str.substring(i).startsWith(pat))){
//                return false;
//            }
//        }
//        return true;
//    }
//    private static String find(String str){
//        StringBuilder basic = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//              boolean f = check(str.substring(0,i+1),str);
//              if(f){
//                 return str.substring(0,i+1);
//
//              }
//
//        }
//        return str;
//    }


//}
