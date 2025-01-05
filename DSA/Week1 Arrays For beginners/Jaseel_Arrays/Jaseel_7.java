//7. Pascals Triangle

import java.util.ArrayList;
import java.util.List;

public class Jaseel_7 {
    public static void main(String[] args) {
        int nums = 4;
        List<List<Integer>> result = PascalsTriangle(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    static List<List<Integer>> PascalsTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);
            result.add(curr);
        }

        return result;
    }
}
