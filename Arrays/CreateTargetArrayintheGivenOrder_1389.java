import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        for (int j = 0; j < nums.length; j++) {
            target[j] = a.get(j);
        }
        return target;
    }
}
