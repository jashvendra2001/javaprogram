
public class rotateOne {

    static void oneRotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];

        }
        arr[n - 1] = temp;

    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    void desireRotate(int arr[], int n) {

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        oneRotate(arr, n);
        print(arr, n);

    }
}
