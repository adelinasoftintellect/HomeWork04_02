import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		int num = input.nextInt();
		System.out.println("The size of the Array is: " + num);

		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				a[0] = 1;
			} else if (i == 1) {
				a[1] = 1;
			} else {
				a[i] = a[i - 2] + a[i - 1];
			}
			System.out.println(a[i]);
		}
	}
}
