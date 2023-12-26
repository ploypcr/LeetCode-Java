import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int l = nums.length;
        List<Integer> newList = new ArrayList<>();
        int res = l;
        for(int i = 0;i < l;i++){
            if(nums[i] == val){
                res--;
            }
            else{
                newList.add(nums[i]);
            }
        }

        for (int i = 0; i < res; i++) {
            nums[i] = newList.get(i);
        }
        return res;
    }
}
