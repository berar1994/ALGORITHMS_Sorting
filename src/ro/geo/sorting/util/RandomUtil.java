package ro.geo.sorting.util;

import java.util.Random;

public class RandomUtil {
	
	private static Random random = new Random();
	private static final Integer HIGH = 100;
	private static final Integer LOW = 1;
	
	public static Integer[] createRandomArray(int length){
		Integer[] array = new Integer[length];
		for(int i = 0; i < length; i++){
			array[i] = random.nextInt(HIGH - LOW) + LOW;
		}
		return array;
	}
	
}
