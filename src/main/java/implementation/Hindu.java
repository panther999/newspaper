package implementation;

import java.util.Calendar;

import build.Newspaper;

public class Hindu extends Newspaper {
	
	
	
	
	
	public Hindu() {
		priceMap.put(Calendar.MONDAY, 2.50D);
		priceMap.put(Calendar.TUESDAY, 2.50D);
		priceMap.put(Calendar.WEDNESDAY, 2.50D);
		priceMap.put(Calendar.THURSDAY, 2.50D);
		priceMap.put(Calendar.FRIDAY, 2.50D);
		priceMap.put(Calendar.SATURDAY, 4.0D);
		priceMap.put(Calendar.SUNDAY, 4.0D);
		
		name= this.getClass().getSimpleName();
		
	}
	
	
	
}
