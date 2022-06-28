public class sortArraywithUsingSortingAlgo {

    static void sort(int arr[], int n) {
        int arr1[] = new int[n];
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++)

        {
            if (arr[i] == 0) {
                count0++;

            } else if (arr[i] == 1) {
                count1++;

            } else if (arr[i] == 2) {
                count2++;

            }

        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);

        int a = 0;
        while (count0 > 0) {

            arr1[a++] = 0;
            count0--;

        }

        while (count1 > 0) {

            arr1[a++] = 1;
            count1--;

        }

        while (count2 > 0) {

            arr1[a++] = 2;
            count2--;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2 };
        int n = arr.length;
        sort(arr, n);

    }

}
