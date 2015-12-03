public class StringComparison {
	public static void main(final String... args) {
		final String s1 = args[0];
		final String s2 = args[1];
		if (s1.equals(s2)) {
			System.out.println("'" + s1 + "'" + " is equal to " + "'" + s2 + "'" + " with case.");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("'" + s1 + "'" + " is equal to " + "'" + s2 + "'" + " without case.");
		}
		final int order = s1.compareTo(s2);
		if (order < 0) {
			System.out.println("'" + s1 + "'" + " is lexically before " + "'" + s2 + "'" + ".");
		}
		if (order == 0) {
			System.out.println("'" + s1 + "'" + " is lexically equal to " + "'" + s2 + "'" + ".");
		}
		if (order > 0) {
			System.out.println("'" + s1 + "'" + " is lexically after " + "'" + s2 + "'" + ".");
		}
	}
}