import java.util.*;

public class findkthmaxandmin {
    static int minkth(int arr[], int n, int p) {
        Arrays.sort(arr);
        return (arr[p - 1]);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5, 5, 46, 4, 65, 7, 5, 5, 3, 5 };
        int n = arr.length;

        System.out.println(minkth(arr, n, 3));

    }

}
