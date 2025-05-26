import java.util.*;

public class KidsWiththeGreatestNumberofCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> b = new ArrayList<>(candies.length);
        int gt = 0;
        for(int ele:candies){
            gt = Math.max(ele,gt);
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies>=gt){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
}
