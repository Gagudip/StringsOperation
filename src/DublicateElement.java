import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class DublicateElement {

	static void DubplicateNumber(int[] arr) {

		Map<Integer, Integer> hs = new HashMap<>();

		int count = 1;

		for (int i : arr) {

			if (hs.containsKey(i)) {

				hs.put(i, hs.get(i) + 1);

			}

			else
				hs.put(i, 1);

		}

		Set<Entry<Integer, Integer>> set = hs.entrySet();

		for (Entry<Integer, Integer> st : set) {

			if (st.getValue() > 1)
				System.out.println("Duplicate Number  " + st.getKey());

		}

	}

	public static void main(String[] args) {

		int data[] = { 10, 11, 20, 31, 10, 23, 20, 12, 66, 0, 31, 20, 61 };

		DubplicateNumber(data);

	}

}
