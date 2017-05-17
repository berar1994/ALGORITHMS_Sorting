package ro.geo.sorting.quicksort;

public class QuickSort {

	public static void sort(Integer[] unsortedArray, int low, int high) {
		int p = 0;

		if (low < high) {
			p = partition(unsortedArray, low, high);
			sort(unsortedArray, low, p);
			sort(unsortedArray, p + 1, high);
		}
	}

	private static int partition(Integer[] array, int low, int high) {
		int pivot = array[low];
		int i = low - 1;
		int j = high;
		int x = 0;

		while (true) {
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i >= j) {
				return j;
			}

			x = array[i];
			array[i] = array[j];
			array[j] = x;
		}
	}

}
