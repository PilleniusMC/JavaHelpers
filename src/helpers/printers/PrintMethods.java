package helpers.printers;

/**
 * A class with different class methods, to help with printing different
 * content.
 * 
 * @author Philipp Kumitz
 *
 */
public abstract class PrintMethods {

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(long[] array) {
		for (long value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(float[] array) {
		for (float value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(double[] array) {
		for (double value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(String[] array) {
		for (String value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array with a prefix.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 * @param prefix a prefix, without a leading or trailing space
	 */
	public static void printPrefixedArray(int[] array, String prefix) {
		System.out.print(prefix + " ");
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array with a prefix.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 * @param prefix a prefix, without a leading or trailing space
	 */
	public static void printArray(long[] array, String prefix) {
		System.out.print(prefix + " ");
		for (long value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array with a prefix.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 * @param prefix a prefix, without a leading or trailing space
	 */
	public static void printArray(float[] array, String prefix) {
		System.out.print(prefix + " ");
		for (float value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array with a prefix.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 * @param prefix a prefix, without a leading or trailing space
	 */
	public static void printArray(double[] array, String prefix) {
		System.out.print(prefix + " ");
		for (double value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Prints the content of an array with a prefix.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 * @param prefix a prefix, without a leading or trailing space
	 */
	public static void printArray(String[] array, String prefix) {
		System.out.print(prefix + " ");
		for (String value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
