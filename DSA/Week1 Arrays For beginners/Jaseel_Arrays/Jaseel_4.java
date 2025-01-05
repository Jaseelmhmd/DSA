//4. Moves Zeros to Left

import java.util.Arrays;

public class Jaseel_4 {
    public static void main(String[] args) {
        int[] arr ={1,5,0,6,8,0,0,1,9};
        System.out.println(Arrays.toString(MoveZerosToLeft(arr)));
    }


    static int[] MoveZerosToLeft(int[] arr){
        int NonZeroIndex = arr.length-1;
        for (int i= arr.length-1;i>=0;i--){
            if(arr[i] != 0){
                arr[NonZeroIndex--] = arr[i];
            }
        }
        for (int i = NonZeroIndex;i>=0;i--){
            arr[i] = 0;
        }
        return arr;
    }
}
