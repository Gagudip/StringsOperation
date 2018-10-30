
public class SecondLargestNumber {

	static void secondLargest(int[] input) {

		int first = 0;
		int second = 0;

		for (int i = 0; i < input.length; i++) {

			if (input[i] > first) {

				second = first;
				first = input[i];

			}
			if (input[i] > second && first > input[i]) {

				second = input[i];
			}

		}

		System.out.println(second);

	}

	public static void main(String[] args) {

		int data[] = { 3, 5, 6, 1, 7, 23, 41, 12, 66, 32, 11, 2,65 };

		secondLargest(data);

	}

}
