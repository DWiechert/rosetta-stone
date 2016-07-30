import java.util.List;
import java.util.Arrays;

public class IndexOf {
	public static void main(final String... args) {
		final int elementFound = 3;
		final int elementNotFound = 5;
		final List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		System.out.println(indexOf(list, elementNotFound));
		System.out.println(indexOf(list, elementFound));
	}
	
	private static int indexOf(final List<Integer> list, final int element) {
		int index = 0;
		for (final Integer i : list) {
			if (i == element) {
				return index;
			}
			index++;
		}
		return -1;
	}
}
