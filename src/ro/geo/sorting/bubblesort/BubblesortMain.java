package ro.geo.sorting.bubblesort;

import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class BubblesortMain {
	
	public static void run(){
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		BubbleSort.sort(array);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}
	
}
