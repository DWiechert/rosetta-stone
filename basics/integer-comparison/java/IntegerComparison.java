public class IntegerComparison {
	public static void main(final String... args) {
		final int i1 = Integer.parseInt(args[0]);
		final int i2 = Integer.parseInt(args[1]);
		if (i1 < i2) {
			System.out.println(i1 + " is less than " + i2 + ".");
		}
		if (i1 == i2) {
			System.out.println(i1 + " is equal to " + i2 + ".");
		}
		if (i1 > i2) {
			System.out.println(i1 + " is greater than " + i2 + ".");
		}
	}
}
