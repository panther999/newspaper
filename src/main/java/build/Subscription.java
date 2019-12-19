package build;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Subscription {
	static NewspaperFactory factory = new NewspaperFactory();
	
	List<Newspaper> papers = new ArrayList<Newspaper>();
	String month = null;
	
	
	
	//Using "polymorphism" -> if month is passed, calculate the price of that month
	//and if it is not passed show price of current month

	/*
	 * Get total price of papers for this month only
	 * Assumptions : Since this month is already running - calculation should be done from today to end of the moth
	 */
	private Double getPriceOfPapers(List<Newspaper> papers) {
	
		return papers.parallelStream()
				.map(p -> p.getPriceOfthisMonth())
				.mapToDouble(d -> d)
				.sum();
	}
	
	/*
	 * Get total price of papers for any month
	 * Assumptions : User want to know the total cost of newspaper in a particular month of this(running ) year only
	 * 
	 */
	// 
	private Double getPriceOfPapers(List<Newspaper> papers, String month) {
		//System.out.print("Price of newspapers subscription in month " + month + " :");
		return papers.parallelStream()
				.map(p -> p.getPriceOfSpecificMonth(month))
				.mapToDouble(d -> d)
				.sum();
	}
	
	
	
	
	/*
	 * Subscription is created and user asking for price
	 * 
	 */
	public Double getPriceOfPapers() {
		return getPriceOfPapers(this.papers);		
	}
	
	
	
	
	/*
	 * Subscription is created and user asking for price in particular month
	 * 
	 */
	public Double getPriceOfPapers(String month) {
		return getPriceOfPapers(this.papers,month);		
	}
	
	

	/*
	 * Subscription is created
	 * 
	 */
	public Subscription(String subscribedNewsPaperInp){
		// split input with comma and pass it to factory method as list to get list of objects of subscribed newspapers
		this.papers = factory.getAllNewsPapers(Arrays.asList(subscribedNewsPaperInp.split(",")));
	}
}
