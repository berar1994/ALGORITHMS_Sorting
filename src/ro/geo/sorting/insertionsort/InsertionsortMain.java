package ro.geo.sorting.insertionsort;

import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class InsertionsortMain {

	public static void run() {
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		Insertionsort.sort(array);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}

}
