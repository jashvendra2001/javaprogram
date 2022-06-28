class maxmin {
    static void max(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("gretest number in the array:-" + max);

    }

    static void min(int arr[], int n) {
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.print("smallest number in the array:-" + min);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2324, 34, 3, 43, 54, 3535, 0, 65, 7, 68, 68675, 5, 34, 23, 2 };
        int n = arr.length;
        max(arr, n);
        min(arr, n);

    }

}