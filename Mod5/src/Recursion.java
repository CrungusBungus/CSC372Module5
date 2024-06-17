import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		int sum = getsum(0,5);
		System.out.println("Total sum of numbers: " + sum);
	}
	public static int getsum(int sumnum, int remaining) {
		System.out.println("Input a number to add: ");
		Scanner in = new Scanner(System.in);
		int newnum = in.nextInt();
		int newsum = newnum + sumnum;
		int newremaining = remaining - 1;
		if (remaining > 1) {
			return getsum(newsum, newremaining);
		} else {
			return newsum;
		}
	}
}