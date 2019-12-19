package implementation;

import java.util.Calendar;

import build.Newspaper;

public class BM extends Newspaper {

	public BM() {
		priceMap.put(Calendar.MONDAY, 1.50D);
		priceMap.put(Calendar.TUESDAY, 1.50D);
		priceMap.put(Calendar.WEDNESDAY, 1.50D);
		priceMap.put(Calendar.THURSDAY, 1.50D);
		priceMap.put(Calendar.FRIDAY, 1.50D);
		priceMap.put(Calendar.SATURDAY, 1.50D);
		priceMap.put(Calendar.SUNDAY, 1.50D);
		name= this.getClass().getSimpleName();
	}
}
