public class CommandLineArguments {
	public static void main(final String... args) {
		System.out.println(args.length + " arguments were provided:");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
