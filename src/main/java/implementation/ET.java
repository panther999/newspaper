package implementation;

import java.util.Calendar;

import build.Newspaper;

public class ET extends Newspaper {
	
	public ET() {
		priceMap.put(Calendar.MONDAY, 2.0D);
		priceMap.put(Calendar.TUESDAY, 2.0D);
		priceMap.put(Calendar.WEDNESDAY, 2.0D);
		priceMap.put(Calendar.THURSDAY, 2.0D);
		priceMap.put(Calendar.FRIDAY, 2.0D);
		priceMap.put(Calendar.SATURDAY, 2.0D);
		priceMap.put(Calendar.SUNDAY, 10.0D);
		
		name= this.getClass().getSimpleName();
	}

}
