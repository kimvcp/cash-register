package flexiblesort;

public class SortForAnyObject {
	public static void sort(Object[] data, Comparator cmp) {

		for (int i = 0; i < data.length - 1; i++) {// i แบ่งส่วนเรียงแล้วกับยังไม่เรียง
			int minPos = i;
			for (int j = i + 1; j < data.length; j++) { // วนลูปหาค่าน้อยสุด
				if (cmp.compare(data[j], data[minPos]) < 0) {
					minPos = j;
				}
			}
			// สลับข้อมูลใน minPos และ i ทำให้ข้อมูลใน minPos ไปอยู่ส่วนที่เรียงแล้ว
			Object temp = data[minPos];
			data[minPos] = data[i];
			data[i] = temp;
		}

	}
}
