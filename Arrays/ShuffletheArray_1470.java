public class ShuffletheArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int l=0;
        int r=n;
        for(int i=0;l<n;i+=2,l++,r++){
            res[i] = nums[l];
            res[i+1] = nums[r];
        }
        return res;
    }
}
