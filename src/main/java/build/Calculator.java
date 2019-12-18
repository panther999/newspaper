package build;

import java.util.List;

public class Calculator {

	/*
	 * Get total price of papers for this month only
	 * Assumptions : Since this month is already running - calculation should be done from today to end of the moth
	 */
	public static Double getPriceOfPapers(List<Newspaper> papers) {
		
		return papers.parallelStream()
				.map(p -> p.getPriceOfthisMonth())
				.mapToDouble(d -> d)
				.sum();
	}
	
	/*
	 * Get total price of papers for anymonth
	 * Assumptions : User want to know the total cost of newspaper in a particular month of this(running ) year only
	 * 
	 */
	
	public static Double getPriceOfPapers(List<Newspaper> papers, String month) {
		
		return papers.parallelStream()
				.map(p -> p.getPriceOfSpecificMonth(month))
				.mapToDouble(d -> d)
				.sum();
	}
}
