package ro.geo.sorting.shellsort;


import ro.geo.sorting.util.ConsoleUtil;
import ro.geo.sorting.util.Constants;
import ro.geo.sorting.util.RandomUtil;

public class ShellSortMain {
	
	public static void run() {
		Integer[] array = RandomUtil.createRandomArray(Constants.ARRAY_LENGTH.value());
		System.out.println("Unsorted:");
		ConsoleUtil.printArray(array);
		
		ShellSort.sort(array);
		
		System.out.println("Sorted:");
		ConsoleUtil.printArray(array);
	}

	
}
