public class Question9 {
//    https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126
    public static void main(String[] args) {
        System.out.println(printMinNumberForPattern("IDDIDI"));
    }
    static String printMinNumberForPattern(String S){
        // code here
        StringBuilder ans  = new StringBuilder();
        int currMax = 0;
        int last =0;

        for(int i=0;i < S.length() ;i++){
            int nextD = 0;
            if(S.charAt(i)=='I'){
                //count next consecutive D
                int j=i+1;

                while(j<S.length() && S.charAt(j)=='D'){
                    nextD++;
                    j++;
                }
                if(i==0){
                    ans.append(1);
                    ans.append(nextD+2);
                    currMax=nextD+2;

                }
                else{
                    ans.append(currMax+1+nextD);
                    currMax=currMax+1+nextD;
                }
                last=currMax;
            }
            else{
                if(i==0){
                    int j=i+1;
                    while(j<S.length() && S.charAt(j)=='D'){
                        nextD++;
                        j++;
                    }
                    ans.append(nextD+2);
                    ans.append(nextD+1);
                    currMax=nextD+2;
                    last = nextD+1;
                }
                else{
                    last=last-1;
                    ans.append(last);

                }
            }

        }
        return ans.toString();
    }
}
