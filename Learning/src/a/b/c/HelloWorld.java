package a.b.c;

class HelloWorld {

	// the class not \*

	public static void main(String md[]) {

		md = new String[2];

		md[0] = "Hello";
		md[1] = "World!";

		for (int i = 0; i < md.length; i++) {

			System.out.println(md[i]);
		}

	}

}
