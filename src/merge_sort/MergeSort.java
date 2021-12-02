package merge_sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 7, 6, 4, 2, 9, 3};
        int[] temp = new int[list.length];

        MergeSort mergeSort = new MergeSort();
        mergeSort.display("BEFORE SORT: ", list);
        mergeSort.sort(list, temp, 0, list.length - 1);
        mergeSort.display("AFTER SORT: ", list);
    }

    private void sort(int[] list, int[] temp, int l, int r) {
        int m;

        if (l < r) {
            m = (l + r) / 2;

            sort(list, temp, l , m);
            sort(list, temp, m+ 1, r);

            merge(list, temp, l, m, r);
        }
    }

    private void merge(int[] list, int[] temp, int l, int m, int r) {

        int left = l, right = m + 1, i;

        for (i = l; left <= m && right <= r; i++) {
            if (list[left] <= list[right]) {
                temp[i] = list[left++];
            } else {
                temp[i] = list[right++];
            }
        }

        while (left <= m) {
            temp[i++] = list[left++];
        }

        while (right <= r) {
            temp[i++] = list[right++];
        }

        for (i = l; i <= r; i++) {
            list[i] = temp[i];
        }
    }

    private void display(String message, int[] list) {
        System.out.println(message);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
