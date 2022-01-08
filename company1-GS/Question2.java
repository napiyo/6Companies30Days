public class Question2 {
    public static void main(String[] args) {
        int[] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
        System.out.println(isRectangleOverlap(rec1,rec2));
    }
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // sharing  sides are not considered overlaps - leetcode
        if(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3] || rec1[3] <=rec2[1])
        {
            return false;
        }
        return true;
    }
}
