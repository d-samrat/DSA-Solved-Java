public class NumberofGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    res+=1;
                }
            }
        }
        return res;
    }
}


