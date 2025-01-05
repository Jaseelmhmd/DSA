//3. Duplicate in an array


import java.util.List;
import java.util.ArrayList;
public class Jaseel_3 {
    public static void main(String[] args) {
        int[] num ={4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(num);
        for (int nums:res){
            System.out.println(nums);
        }
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            int idx = nums[x-1];
            if (idx < 0) {
                ans.add(x);
            }
            nums[x - 1] *= -1;
        }
        return ans;
    }
}
