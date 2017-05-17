package ro.geo.sorting.quicksort;

import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class QuickSortMain {

	final static int LOW = Constants.LOW.value();
	final static int HIGH = Constants.ARRAY_LENGTH.value() - 1;
	
	public static void run() {
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		QuickSort.sort(array, LOW, HIGH);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}

}
