package ro.geo.sorting.insertionsort;

public class InsertionSort {
	
	public static void sort(Integer[] unsortedArray){
		for(int i = 1; i < unsortedArray.length; i++){
			int x = unsortedArray[i];
			int j = i - 1;
			
			while( (j >= 0) && (unsortedArray[j] > x) ){
				unsortedArray[j+1] = unsortedArray[j];
				j--;
			}
			
			unsortedArray[j+1] = x;
		}
	}
	
}
