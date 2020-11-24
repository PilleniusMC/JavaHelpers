package helpers.array;

/**
 * A class with different methods, to help with arrays.
 * 
 * @author Philipp Kumitz
 *
 */
public abstract class ArrayMethods {

	/**
	 * A method which takes two arrays and merges their contents into a new array.
	 * 
	 * @param leftSideArray  The array which should have the first part of the new
	 *                       content
	 * @param rightSideArray The array which should have the second part of the new
	 *                       content
	 * @return A new array with all elements from the left and right array
	 */
	public int[] merge(int[] leftSideArray, int[] rightSideArray) {
		int[] newArray = new int[(leftSideArray.length + rightSideArray.length)];
		System.arraycopy(leftSideArray, 0, newArray, 0, leftSideArray.length);
		System.arraycopy(rightSideArray, 0, newArray, leftSideArray.length, rightSideArray.length);
		return newArray;

	}

	/**
	 * A method which takes two arrays and merges their contents into a new array.
	 * 
	 * @param leftSideArray  The array which should have the first part of the new
	 *                       content
	 * @param rightSideArray The array which should have the second part of the new
	 *                       content
	 * @return A new array with all elements from the left and right array
	 */
	public long[] merge(long[] leftSideArray, long[] rightSideArray) {
		long[] newArray = new long[(leftSideArray.length + rightSideArray.length)];
		System.arraycopy(leftSideArray, 0, newArray, 0, leftSideArray.length);
		System.arraycopy(rightSideArray, 0, newArray, leftSideArray.length, rightSideArray.length);
		return newArray;

	}

	/**
	 * A method which takes two arrays and merges their contents into a new array.
	 * 
	 * @param leftSideArray  The array which should have the first part of the new
	 *                       content
	 * @param rightSideArray The array which should have the second part of the new
	 *                       content
	 * @return A new array with all elements from the left and right array
	 */
	public float[] merge(float[] leftSideArray, float[] rightSideArray) {
		float[] newArray = new float[(leftSideArray.length + rightSideArray.length)];
		System.arraycopy(leftSideArray, 0, newArray, 0, leftSideArray.length);
		System.arraycopy(rightSideArray, 0, newArray, leftSideArray.length, rightSideArray.length);
		return newArray;

	}

	/**
	 * A method which takes two arrays and merges their contents into a new array.
	 * 
	 * @param leftSideArray  The array which should have the first part of the new
	 *                       content
	 * @param rightSideArray The array which should have the second part of the new
	 *                       content
	 * @return A new array with all elements from the left and right array
	 */
	public double[] merge(double[] leftSideArray, double[] rightSideArray) {
		double[] newArray = new double[(leftSideArray.length + rightSideArray.length)];
		System.arraycopy(leftSideArray, 0, newArray, 0, leftSideArray.length);
		System.arraycopy(rightSideArray, 0, newArray, leftSideArray.length, rightSideArray.length);
		return newArray;

	}

	/**
	 * A method which takes two arrays and merges their contents into a new array.
	 * 
	 * @param leftSideArray  The array which should have the first part of the new
	 *                       content
	 * @param rightSideArray The array which should have the second part of the new
	 *                       content
	 * @return A new array with all elements from the left and right array
	 */
	public String[] merge(String[] leftSideArray, String[] rightSideArray) {
		String[] newArray = new String[(leftSideArray.length + rightSideArray.length)];
		System.arraycopy(leftSideArray, 0, newArray, 0, leftSideArray.length);
		System.arraycopy(rightSideArray, 0, newArray, leftSideArray.length, rightSideArray.length);
		return newArray;

	}

	/**
	 * A method which adds elements to an array
	 * 
	 * @param originalArray   The original array.
	 * @param elementToAppend The new element, which gets appended
	 * @return A new array, which has the appended element in it.
	 */
	public int[] addElement(int[] originalArray, int elementToAppend) {
		int i;
		int n = originalArray.length;
		int[] newArray = new int[n + 1];
		for (i = 0; i < n; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[n] = elementToAppend;
		return newArray;
	}

	/**
	 * A method which adds elements to an array
	 * 
	 * @param originalArray   The original array.
	 * @param elementToAppend The new element, which gets appended
	 * @return A new array, which has the appended element in it.
	 */
	public long[] addElement(long[] originalArray, long elementToAppend) {
		int i;
		int n = originalArray.length;
		long[] newArray = new long[n + 1];
		for (i = 0; i < n; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[n] = elementToAppend;
		return newArray;
	}

	/**
	 * A method which adds elements to an array
	 * 
	 * @param originalArray   The original array.
	 * @param elementToAppend The new element, which gets appended
	 * @return A new array, which has the appended element in it.
	 */
	public float[] addElement(float[] originalArray, float elementToAppend) {
		int i;
		int n = originalArray.length;
		float[] newArray = new float[n + 1];
		for (i = 0; i < n; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[n] = elementToAppend;
		return newArray;
	}

	/**
	 * A method which adds elements to an array
	 * 
	 * @param originalArray   The original array.
	 * @param elementToAppend The new element, which gets appended
	 * @return A new array, which has the appended element in it.
	 */
	public double[] addElement(double[] originalArray, double elementToAppend) {
		int i;
		int n = originalArray.length;
		double[] newArray = new double[n + 1];
		for (i = 0; i < n; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[n] = elementToAppend;
		return newArray;
	}

	/**
	 * A method which adds elements to an array
	 * 
	 * @param originalArray   The original array.
	 * @param elementToAppend The new element, which gets appended
	 * @return A new array, which has the appended element in it.
	 */
	public String[] addElement(String[] originalArray, String elementToAppend) {
		int i;
		int n = originalArray.length;
		String[] newArray = new String[n + 1];
		for (i = 0; i < n; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[n] = elementToAppend;
		return newArray;
	}

	/**
	 * A method which takes the first element in an array and then moves all
	 * elements left.
	 * 
	 * @param array The array from which you want to get the first element
	 * @return the first element in the array
	 */
	public int popLeft(int[] array) {
		int poppedElement = array[0];
		System.arraycopy(array, 1, array, 0, array.length - 1);
		array[array.length - 1] = 0;

		return poppedElement;
	}

	/**
	 * A method which takes the first element in an array and then moves all
	 * elements left.
	 * 
	 * @param array The array from which you want to get the first element
	 * @return the first element in the array
	 */
	public long popLeft(long[] array) {
		long poppedElement = array[0];
		System.arraycopy(array, 1, array, 0, array.length - 1);
		array[array.length - 1] = 0;

		return poppedElement;
	}

	/**
	 * A method which takes the first element in an array and then moves all
	 * elements left.
	 * 
	 * @param array The array from which you want to get the first element
	 * @return the first element in the array
	 */
	public float popLeft(float[] array) {
		float poppedElement = array[0];
		System.arraycopy(array, 1, array, 0, array.length - 1);
		array[array.length - 1] = 0;

		return poppedElement;
	}

	/**
	 * A method which takes the first element in an array and then moves all
	 * elements left.
	 * 
	 * @param array The array from which you want to get the first element
	 * @return the first element in the array
	 */
	public double popLeft(double[] array) {
		double poppedElement = array[0];
		System.arraycopy(array, 1, array, 0, array.length - 1);
		array[array.length - 1] = 0;

		return poppedElement;
	}

	/**
	 * A method which takes the first element in an array and then moves all
	 * elements left.
	 * 
	 * @param array The array from which you want to get the first element
	 * @return the first element in the array
	 */
	public String popLeft(String[] array) {
		String poppedElement = array[0];
		System.arraycopy(array, 1, array, 0, array.length - 1);
		array[array.length - 1] = null;

		return poppedElement;
	}
}
