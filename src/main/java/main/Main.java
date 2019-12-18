package main;

import java.util.Arrays;
import java.util.List;

import build.Calculator;
import build.Newspaper;
import build.NewspaperFactory;

public class Main {

	public static void main(String[] args) {
		NewspaperFactory factory = new NewspaperFactory();
		
		
		//more than 1
		String input="HT,TOI";
		List<Newspaper> papers = factory.getAllNewsPapers(Arrays.asList(input.split(",")));
		System.out.println("Price of papers for this month :" + Calculator.getPriceOfPapers(papers));
		System.out.println("Price of papers for december month :" + Calculator.getPriceOfPapers(papers,"december"));
		System.out.println("-----------------------------");
		
		
		//one input
		input="HT";
		List<Newspaper> papers2 = factory.getAllNewsPapers(Arrays.asList(input.split(",")));
		System.out.println("Price of papers for this month :" + Calculator.getPriceOfPapers(papers2));
		System.out.println("Price of papers for december month :" + Calculator.getPriceOfPapers(papers2,"december"));
		System.out.println("-----------------------------");
	}
	
	
	
}
