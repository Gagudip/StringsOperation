
public class ShiftingZerosStarting {

	static void ShiftingZero(int arr[]) {

		int count = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!(arr[i] == 0)) {

				arr[count--] = arr[i];

			}

		}

		while (count >= 0) {

			arr[count--] = 0;

		}

		for (int i = 0; i < arr.length; i++)

			System.out.print(" "+arr[i]);
	}

	public static void main(String[] args) {

		int data[] = { 0, 1, 0, 1, 0, 23, 0, 12, 66, 0, 11, 0, 65 };

		ShiftingZero(data);

	}

}
