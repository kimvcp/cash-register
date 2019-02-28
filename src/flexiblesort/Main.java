package flexiblesort;

public class Main {
	public static void main(String[] args) {

		SortForAnyObject sort = new SortForAnyObject();
		Integer[] IntegerArray = { 3, 2, 1, 0, 5, 9, 15 };
		String[] StringArray = { "C", "A", "B", "G", "D", "E", "F"};
		sort.sort(IntegerArray, new IntegerComparator());
		sort.sort(StringArray, new StringComparator());

		System.out.println("Sorted Integer: ");
		printSortedObject(IntegerArray);

		System.out.println("Sorted String: ");
		printSortedObject(StringArray);

	}

	public static void printSortedObject(Object[] array) {
		for (Object element : array) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
}