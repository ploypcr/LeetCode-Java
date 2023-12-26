import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> MergeArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if(nums1[i] <= nums2[j]){
                MergeArray.add(nums1[i]);
                i++;
            }
            else {
                MergeArray.add(nums2[j]);
                j++;
            }
        }

        if(i == m && j != n){
            while(j < n){
                MergeArray.add(nums2[j]);
                j++;
            }
        }
        if(j == n && i != m){
            while(i < m){
                MergeArray.add(nums1[i]);
                i++;
            }
        }
        for(int k = 0;k < (m+n);k++){
            nums1[k] = MergeArray.get(k);
        }
        //System.out.println(MergeArray.toString());
    }
}
