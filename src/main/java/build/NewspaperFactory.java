package build;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import implementation.BM;
import implementation.ET;
import implementation.HT;
import implementation.Hindu;
import implementation.TOI;



public class NewspaperFactory {


	public Newspaper getNewsPaper(String nameOfnewspaper) {
		
		try {
		switch(nameOfnewspaper) {
			case "HT":
				return new HT(); 
			case "TOI" :
				return new TOI();
			case "Hindu" :
				return new Hindu();
			case "ET" :
				return new ET();
			case "BM" :
				return new BM();
			default :
				throw new NewspaperNotDefinedException(nameOfnewspaper + ": Newspaper name was not defined");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("SYSTEM IS CLOSING DOWN ---");
			System.exit(0);
		}
		
		return null;
			
		
	}
	
	public List<Newspaper> getAllNewsPapers(List<String> newspaperInput) {
		 return newspaperInput.stream()
				 .map(p -> getNewsPaper(p))
				 .collect(Collectors.toList());
	}
}
