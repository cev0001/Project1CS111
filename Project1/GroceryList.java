public class GroceryList {

	private static String[] elements;
	private static int currentSize;
	private static int maxSize;

	public GroceryList(int maxElements) {
		if (maxSize > 0) {
			this.maxSize = maxElements;
			this.elements = new String[maxElements];
			this.currentSize = 0;
		}

	}

	public static int getSize() {

		return elements.length;

	}

	public static int getMaxSize() {

		return elements.length;

	}

	public static boolean isEmpty() {

		if (isFull() == false) {
			return false;
		}
		if (isFull() == true) {

		}
		else{
		elements[currentSize] = newItem;
		currentSize += 1; 

		}
	}

	public static boolean isFull() {
		return false;

	}

	public static boolean isValidPositionToInsert(int position) {
		return false;

	}

	public static boolean isValidPositionToDelete(int position) {
		return false;

	}

	public static void add(String newItem) {

	}

	public static void add(int position, String newItem) {

	}

	public static void remove() {

	}

	public static void remove(int position) {

	}

	public static String get(int position) {
		return null;

	}

	public String toString() {
		return null;

	}

	public static void sort() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
