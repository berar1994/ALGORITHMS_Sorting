package ro.geo.sorting.insertionsort;

import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class InsertionSortMain {

	public static void run() {
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		InsertionSort.sort(array);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}

}
