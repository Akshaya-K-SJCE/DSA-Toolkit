public class MaxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) max = num;
        }
        return max;
    }
public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        System.out.println("Maximum Element: " + findMax(arr));
    }
}
