public class BinarySearch{

	//Main part of the program that runs commands
	public static void main(String[] args) {
		
		//initialized ordered array with nine slots
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		//Call the method and print
		System.out.println(find(nums, 2));
	}
	//Static String method that finds the number and it's number of passes or returns "Value Not Found"
	public static String find(int[] nums, int val) {
		
		//Initialize variables for array, Upper & Lower bound, middle array value and string message
		int num[] = nums;
		int Ubound = nums.length - 1;
		int Lbound = 0;
		int middle = 0;
		String msg = "";
		
		//For loop iterates through length of array
		for (int i = 0; i < nums.length; i++) {
			
			//finds value from middle index between upper and lower bound
			middle = nums[(Ubound + Lbound) / 2];
			
			//Stops loop when value is found
			if (middle == val) {
				msg = "Value: " + val + " found in " + (i + 1) + " passes";
				break;
			}
			// adjusts the lower bound if value not found above or msg
			if (val > middle) {
				Lbound = ((Ubound + Lbound) / 2) + 1;
			}
			else {
				msg = "Value not found";
			}
			// adjusts the upper bound if value not found above or msg
			if (val < middle) {
				Ubound = ((Ubound + Lbound) / 2) - 1;
			}
			else {
				msg = "Value not found";
			}
		}
		
		//return the stored message
		return msg;
	}
} 



