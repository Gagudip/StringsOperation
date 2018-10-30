package PreservingSpaceReverse;

public class PreserveSpace {

	// TODO Auto-generated method stub

	static void reverses(String str) {

		char inputArray[] = str.toCharArray();

		char ResultArray[] = new char[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == ' ') {

				ResultArray[i] = ' ';
			}

		}

		for (int i = 0, j=inputArray.length - 1; i < inputArray.length&& j>=0; i++) {
			


				if (!(inputArray[i] == ' ')) {
				

				if (ResultArray[j] == ' ') {
					j--;
				}

				ResultArray[j] = inputArray[i];
				j--;
			}
				System.out.println(String.valueOf(ResultArray));
		}
	
	

	}

	public static void main(String[] args) {

		reverses("My Name is Gagan");

	}

}
