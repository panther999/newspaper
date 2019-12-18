package implementation;

import java.util.Calendar;

import build.Newspaper;

public class TOI extends Newspaper {
	
	
	
	
	
	public TOI() {
		priceMap.put(Calendar.MONDAY, 3.0D);
		priceMap.put(Calendar.TUESDAY, 3.0D);
		priceMap.put(Calendar.WEDNESDAY, 3.0D);
		priceMap.put(Calendar.THURSDAY, 3.0D);
		priceMap.put(Calendar.FRIDAY, 3.0D);
		priceMap.put(Calendar.SATURDAY, 5.0D);
		priceMap.put(Calendar.SUNDAY, 6.0D);
		
		name= this.getClass().getSimpleName();
		
	}
	
	
	
}
