package LogicalProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateNumfromArrayByusingHashSet {

	public static void main(String[] abhi) {
		int ar[] = { 1, 2, 3, 4, 5, 5, 4 };

		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= ar.length - 1; i++) {
			if (!set.contains(ar[i])) {
				set.add(ar[i]);
			} else {
				list.add(ar[i]);

			}

		}
		System.out.println("Unique number:= " + set);
		System.out.println("Duplicate value are" + list);
	}

}
