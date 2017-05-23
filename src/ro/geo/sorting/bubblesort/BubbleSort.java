package ro.geo.sorting.bubblesort;

public class BubbleSort {
	
	public static void sort(Integer[] unsorted){
		for(int i = 1; i < unsorted.length; i++){
			for(int j = 0; j < unsorted.length - 1; j++){
				if(unsorted[j] > unsorted[j + 1]){
					unsorted[j] = unsorted[j] + unsorted[j + 1];
					unsorted[j + 1] = unsorted[j] - unsorted[j + 1];
					unsorted[j] = unsorted[j] - unsorted[j + 1];
				}
			}
		}
	}
	
	
	
}
