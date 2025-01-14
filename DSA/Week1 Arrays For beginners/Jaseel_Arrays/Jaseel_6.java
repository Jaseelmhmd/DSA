//6. 3 Sum Problem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jaseel_6 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = ThreeSumProblem(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    static List<List<Integer>> ThreeSumProblem(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0 && nums[i] == nums[i-1]) continue;
            int j=i+1,k= nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                } else if (sum>0) {
                    k--;
                }else {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while (j<k && nums[j]==nums[j+1]) j++;
                    while (j<k && nums[k]==nums[k-1]) k--;
                }
            }
        }
        return res;
    }
}
