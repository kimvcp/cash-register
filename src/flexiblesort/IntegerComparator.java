package flexiblesort;

public class IntegerComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer ob1 = (Integer) o1;
		Integer ob2 = (Integer) o2;
		if (ob1 < ob2) {
			return -1;
		} else if (ob1 == ob2) {
			return 0;
		} else {
			return 1;
		}
	}
}
