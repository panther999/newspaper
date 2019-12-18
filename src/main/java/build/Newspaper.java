package build;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;


public abstract class Newspaper {
	
	public String name;
	public HashMap<Integer,Double> priceMap = new HashMap<Integer,Double>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<Integer, Double> getPriceMap() {
		return priceMap;
	}

	
	public double returnPrice(int day ) {
		return this.priceMap.get(day);
	}
	
	public double getPriceOfthisMonth() {
		Double totalPrice = 0.00D;
		try {
			LocalDate date = LocalDate.now();
			int totalDays = date.getMonth().length(date.isLeapYear());
			int todaysDay = date.getDayOfMonth();
						 
			
			
			for(int i=todaysDay; i<= totalDays-1; i++) {
				LocalDate tmp = date.plusDays(1);
				totalPrice = totalPrice + priceMap.get(tmp.getDayOfWeek().getValue());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return totalPrice;
	}
	
	public double getPriceOfSpecificMonth(String monthName) {
		Double totalPrice = 0.00D;
		try {
									
			LocalDate date = LocalDate.of(LocalDate.now().getYear(), Month.valueOf(monthName.toUpperCase()).getValue(), 1); 
			int totalDays = date.getMonth().length(date.isLeapYear());
			int todaysDay = date.getDayOfMonth();
						 
			
			for(int i=todaysDay; i<= totalDays-1; i++) {
				LocalDate tmp = date.plusDays(1);
				totalPrice = totalPrice + priceMap.get(tmp.getDayOfWeek().getValue());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return totalPrice;
	}
	
	
	
	
}
