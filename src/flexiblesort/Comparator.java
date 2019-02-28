package flexiblesort;

/**
 * An interface for applying strategy patterns to help make the sort code more
 * flexible so that it can be used to sort any types of data.
 * 
 * @author kimvcp
 * 
 */
public interface Comparator {
	int compare(Object o1, Object o2);
}
