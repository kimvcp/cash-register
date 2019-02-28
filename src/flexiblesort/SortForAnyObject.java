package flexiblesort;

public class SortForAnyObject {
	public void sort(Object[] data, Comparator cmp) {

		// i divides array into two parts: already-sorted, not sorted
		for (int i = 0; i < data.length - 1; i++) {
			int minPosition = i;

			// loop to find index containing a minimum value
			for (int j = i + 1; j < data.length; j++) {
				if (cmp.compare(data[j], data[minPosition]) < 0) {
					minPosition = j;
				}
			}
			// swap minPos and i so that data in minPos index will
			// be the already-sorted part
			Object object = data[minPosition];
			data[minPosition] = data[i];
			data[i] = object;
		}

	}
}
