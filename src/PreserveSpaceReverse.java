
public class PreserveSpaceReverse {

	public static void stringreverse(String Str) {

		char[] InputArray = Str.toCharArray();

		char[] ResultArray = new char[Str.length()];

		for (int i = 0; i < Str.length(); i++) {

			if (InputArray[i] == ' ') {

				ResultArray[i] = ' ';
			}

		}

		int j = Str.length() - 1;

		for (int i = 0; i < Str.length(); i++) {

			if (!(InputArray[i] == ' ')) {
				if (ResultArray[j] == ' ')
					j--;

				ResultArray[j] = InputArray[i];
				j--;

			}
			System.out.println(String.valueOf(ResultArray));
		}

		
	}

	public static void main(String[] args) {

		stringreverse("My name is Gagandeep Singh");

	}

}
