import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int flag = 0;
            for(int j=0;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    flag+=1;
                }
            }
            res[i] = flag;
        }
        return res;
    }
}
