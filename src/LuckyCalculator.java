import java.util.Arrays;

public class LuckyCalculator {

	public static int luck(String ticket) {
		int firstSum = 0, secondSum = 0;
		for (int i = 0; i < ticket.length(); i++) {
			if (i < ticket.length() / 2)
				firstSum += new Integer(ticket.charAt(i) + "");
			else
				secondSum += new Integer(ticket.charAt(i) + "");
		}
		return firstSum - secondSum;
	}// luck(String)

	static int stringSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++)
			sum += new Integer(str.charAt(i) + "");
		return sum;
	}// stringSum(String)
	
	static char[] smallestLucky(char[] arr, int sum, int length, int where)
	{
		//char[] arr = new char[length];
		//Arrays.fill(arr, '0');
		int quotient, remainder;
		remainder = sum % 9;
		quotient = (sum - remainder) / 9;
		int start = where + length - quotient;// this is the index where first non-zero char will appear
		if (remainder != 0)
			arr[start - 1] = (remainder + "").charAt(0);
		for (int i = start; i < start + quotient; i++)
			arr[i] = (9 + "").charAt(0);
		return arr;
	}
	static char[] biggestLucky(char[] arr, int sum, int length, int where)
	{
		//char[] arr = new char[length];
		//Arrays.fill(arr, '0');
		int quotient, remainder;
		remainder = sum % 9;
		quotient = (sum - remainder) / 9;
 		int end = where + quotient;// this is the index where last non-zero char will appear
		if (remainder != 0)
			arr[end] = (remainder + "").charAt(0);
		for (int i = 0; i < end; i++)
			arr[i] = (9 + "").charAt(0);
		return arr;
	}
	public static void printLuck(String ticket) {
		int len = ticket.length();
		int halfLen = (len + 1) / 2; // rounding up
		String firstHalf = ticket.substring(0, len / 2);
		String secondHalf = ticket.substring(len / 2, len);
		int firstVal = new Integer(firstHalf);
		int secondVal = new Integer(secondHalf);
		
		int firstSum = stringSum(firstHalf);
		int secondSum = stringSum(secondHalf);

		if (firstSum == secondSum)
		{
			System.out.println("Ticket " + ticket + " is lucky!");
			return;
		}

		int prev, next;
		String prevStr, nextStr;
		// Previous lucky number in the decremented firstVal
		prevStr = biggestLucky(stringSum((firstVal - 1) + ""), halfLen);
		nextStr = smallestLucky(stringSum((firstVal + 1) + ""), halfLen);
		int currentSum = 0;
		for (int i = 0; i < halfLen; i++)
		{
			currentSum += new Integer(secondHalf.charAt(i) + "");
			if (currentSum > firstSum)
				break;
			else
			{
				prevStr = smallestLucky(firstSum-currentSum, halfLen-i);
				nextStr = biggestLucky(firstSum-currentSum, halfLen-i);
			}
	
		}
		System.out.println("Ticket " + ticket + ":");
		System.out.println("Previous was ")
		
	}

	
	public static void main(String[] args) {
		System.out.println("Hiiiii");
		System.out.println(luck("12003"));

	}

}
