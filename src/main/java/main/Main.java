package main;

import build.Subscription;

public class Main {
		

	public static void main(String[] args) {
		Double price=0.00D;
		
		//program input 
		try {
			if(args.length > 0 ) {
				String MonthToCheck = null;
				
					
					//create a new subscription first
					Subscription subscription = new Subscription(args[0].toUpperCase());

					
					//Additional feature to check subscription cost in a particular month
					if (args.length == 2)
						MonthToCheck= args[1].toUpperCase(); 
					
					
					
					if(MonthToCheck == null) {
						//Give price of subscribed newspapers in this month - assuming user is going to start subscription from today's (date)
						price = subscription.getPriceOfPapers(); 
					}
					else {
						price = subscription.getPriceOfPapers(MonthToCheck);
					}
				
			}
			else {
				System.out.println("Argument size should be 1. Please checked passed parameters");
				System.exit(0);
			}
			
			
			System.out.println("Price of subscription " + price);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
