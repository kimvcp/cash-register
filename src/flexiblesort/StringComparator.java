package flexiblesort;

public class StringComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String ob1 = (String) o1;
		String ob2 = (String) o2;
		return ob1.compareTo(ob2);
	}

}
