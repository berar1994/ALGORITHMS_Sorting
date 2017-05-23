package ro.geo.sorting.mergesort;

import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class MergeSortMain {

	public static void run() {
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		MergeSort.sort(array);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}
	
}
