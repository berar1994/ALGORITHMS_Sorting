package ro.geo.sorting.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void sort(Integer[] unsortedArray){
		List<Integer> result = sort(new ArrayList<Integer>(Arrays.asList(unsortedArray)));
		for(int i = 0; i < result.size(); i++){
			unsortedArray[i] = result.get(i);
		}
	}
	
	private static List<Integer> sort(List<Integer> unsortedArray){
		if(unsortedArray.size() <= 1){
			return unsortedArray;
		}
		
		// top-down approach
		int arrayLength = unsortedArray.size();
		int middle = arrayLength / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
		
		for(int i = 0; i < arrayLength; i++){
			if(i < middle){
				left.add(unsortedArray.get(i));
			} else{
				right.add(unsortedArray.get(i));
			}
		}
		
		left = sort(left);
		right = sort(right);
		
		return merge(left, right);
	}
	
	private static List<Integer> merge(List<Integer> left, List<Integer> right){
		List<Integer> result = new ArrayList<>(left.size() + right.size());
		
		while( (!left.isEmpty()) && (!right.isEmpty()) ){
			if(left.get(0) <= right.get(0)){
				result.add(left.get(0));
				left = rest(left, left.get(0));
			} else{
				result.add(right.get(0));
				right = rest(right, right.get(0));
			}
		}
		
		while( !left.isEmpty() ){
			result.add(left.get(0));
			left = rest(left, left.get(0));
		}
		
		while( !right.isEmpty() ){
			result.add(right.get(0));
			right = rest(right, right.get(0));
		}
		
		return result;
	}
	
	private static List<Integer> rest(List<Integer> list, Integer elementToRemove){
		list.remove(list.indexOf(elementToRemove));
		return new ArrayList<>(list);
	}
	
}
