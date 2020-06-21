/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) throws Exception {
		
	int x = 0;
	int y = 0;
	
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			// complete the code
			diff = x - y;
		} else {
			// complete the code
			diff = y - x;
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static int divide(int x, int y) throws Exception {
		int divValue = 0;
		if (x == 0 || y == 0) {
			// complete the code
			if (x == 0 && y == 0) throw new Exception("Not possible to devide by 0");
			if (x == 0) {
				divValue = x / y;
			} else {
				divValue = y / x;
			}
		} else {
			// complete the code
			divValue = x / y;
		}
		return divValue;
	}
	
}

