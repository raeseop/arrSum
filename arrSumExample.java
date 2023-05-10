import java.util.Arrays;

public class arrSumExample {
    public static void main(String[] args) {


        int output = arrSum(new int[]{10, -5, 3, 6, -8});
        System.out.println(output);
    }


    public static int arrSum(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return head + arrSum(tail);

    }
}