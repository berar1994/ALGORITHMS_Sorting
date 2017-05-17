package ro.geo.sorting.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	
	private static Random random = new Random();
	private static final Integer HIGH = Constants.HIGH.value();
	private static final Integer LOW = Constants.LOW.value();
	
	public static Integer[] createRandomArray(int length){
		Integer[] array = null;
		Set<Integer> set = new HashSet<>();
		
		while(true){
			set.add(random.nextInt(HIGH - LOW) + LOW);
			if(set.size() == length){ break; }
		}
		
		array = set.toArray(new Integer[set.size()]);
		return array;
	}
	
}
