package ro.geo.sorting.shellsort;

public class ShellSort {
	
	public static void sort(Integer[] unsortedArray){
		int inner, valueToInsert;
		int interval = 1;
		int arrayLength = unsortedArray.length;
		int condition = arrayLength / 3;
		
		while(interval < condition){
			// Knuth's formula: h = h * 3 + 1
			interval = (interval * 3) + 1;
		}
		
		
		while(interval > 0){
			for(int outer = interval; outer < arrayLength; outer++){
				// select value to be inserted
				valueToInsert = unsortedArray[outer];
				inner = outer;
				
				// shift element towards right
				while((inner > interval - 1) && (unsortedArray[inner - interval] >= valueToInsert)){
					unsortedArray[inner] = unsortedArray[inner - interval];
					inner = inner - interval;
				}
				
				// insert the number at gap position
				unsortedArray[inner] = valueToInsert;
			}
			
			// calculate interval
			interval = (interval - 1) / 3;
		}
		
		
	}
	
}
