package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Memory {

	/*
	 * Create a function that takes the memory size (ms is a string type) as an
	 * argument and returns the actual memory size. Examples:
	 * 
	 * actualMemorySize("32GB") --> "29.76GB"
	 * 
	 * actualMemorySize("2GB") --> "1.86GB"
	 * 
	 * actualMemorySize("512MB") --> "476MB"
	 * 
	 * Notes: -The actual storage loss on a USB device is 7% of the overall memory
	 * size! -If the actual memory size was greater than 1 GB, round your result to
	 * two decimal places. -If the memory size after adjustment is smaller then 1
	 * GB, return the result in MB.
	 */

	public static void main(String[] args) {

		System.out.println("actualMemorySize(\"32GB\") should return: \"29.76GB\"" + " does return: \""
				+ actualMemorySize("32GB") + "\"");
		System.out.println("actualMemorySize(\"2GB\") should return: \"1.86GB\"" + " does return: \""
				+ actualMemorySize("2GB") + "\"");
		System.out.println("actualMemorySize(\"512MB\") should return: \"476MB\"" + " does return: \""
				+ actualMemorySize("512MB") + "\"");

	}

	public static String actualMemorySize(String mem) {
		String unit = mem.substring(mem.length() - 2);
		double initMem = Double.parseDouble(mem.substring(0, mem.length() - 2));
		double actMem = initMem * 0.93;
		if (unit.equals("GB") && actMem >= 1) {
			BigDecimal bd = new BigDecimal(actMem);
			BigDecimal rounded = bd.setScale(2, RoundingMode.FLOOR);
			return rounded.toString().concat("GB");
		} else if (unit.equals("GB")) {
			int trueMem = (int) (actMem * 1000);
			return trueMem + "MB";
		} else {
			int trueMem = (int) actMem;
			return trueMem + "MB";
		}
	}

}
