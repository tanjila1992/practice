package program;

public class SecondLargestNumber {
	public static int secondLargestNumberFromArray(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];

	}

	public static void main(String[] args) {
		int b[] = { 2, 4, 3, 1, 6 };
		System.out.println("Second largest number: " + secondLargestNumberFromArray(b,5));
	}

}
