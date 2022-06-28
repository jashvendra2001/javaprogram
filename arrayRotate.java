class rotate {
    static void rotate1(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        rotate1(arr, n);

    }
}