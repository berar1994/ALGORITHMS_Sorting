package ro.geo.sorting.util;

public enum Constants {
	
	ARRAY_LENGTH(15),
	HIGH(100),
	LOW(1);
	
	private Integer value;
	
	private Constants(Integer value){
		this.value = value;
	}
	
	public Integer value(){
		return this.value;
	}
	
}
