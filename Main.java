package gradedassessments2;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
			
		Scanner object = new Scanner(System.in);
		
		SortingFirmsStocksRates sfsr = new SortingFirmsStocksRates();
		SearchSpecificStocksRates sssr = new SearchSpecificStocksRates();
		StocksRatesComparisons src = new StocksRatesComparisons();

		System.out.println("Enter The Number_Of_Firms:");
		int number_of_firms = object.nextInt();
		System.out.println();

		double[] shares_rates = new double[number_of_firms];
		boolean firms_shares_rates[] = new boolean[number_of_firms];

		for(int x=0;x<number_of_firms;x++){
			
			System.out.println("Enter Current Stocks_Rates Of The Firm " + (x+1)+":");
			shares_rates[x] = object.nextDouble();

			System.out.println("Whether Firm's Stocks_Rates Increased Today Compared To Yesterday?");
			firms_shares_rates[x] = object.nextBoolean();
			System.out.println();
			
		}
		
		int choice;
		System.out.println("Welcome To STOCKERS - Nation's Most Trusted Financial Firm!");
		
		do{
			
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("Enter The Operations That You Want To Perform:");
			System.out.println();
			System.out.println("1. Display The Firms Stocks_Rates In Ascending Order:");
			System.out.println("2. Display The Firms Stocks_Rates In Descending Order:");
			System.out.println("3. Display The Total Number_Of_Firms For Which Stocks_Rates Increased Today:");
			System.out.println("4. Display The Total Number_Of_Firms For Which Stocks_Rates Decreased Today:");
			System.out.println("5. Search A Specific Stocks_Rates:");
			System.out.println("6. Press 0 To Exit:");
			System.out.println("--------------------------------------------------");
			System.out.println();

			choice = object.nextInt();
			switch(choice){
			
			case 1:  
				
				    System.out.println();
				    sfsr.ascendingOrderMergeSort(shares_rates,0,shares_rates.length-1);
				    System.out.println("Stocks_Rates In Ascending Order Are:");
				    
				    for(int x=0;x<number_of_firms;x++){
				    	
				    	System.out.print(shares_rates[x] + " ");
				    
				    }
				    
				    break;
				    
			case 2: 
				
					sfsr.descendingOrderMergeSort(shares_rates,0,shares_rates.length-1);
					System.out.println();
					System.out.println("Stocks_Rates In Descending Order Are:");
					
					for(int x=0;x<number_of_firms;x++){
						
						System.out.print(shares_rates[x] + " ");
						
					}
					
					break;
					
			case 3: 
				
					src.ratesIncrease(firms_shares_rates);
					break;
					
			case 4: 
				
					src.ratesDecrease(firms_shares_rates);
					break;
					
			case 5: 
			
					sssr.searchSpecificStocksRates(shares_rates);
					break;
	
			}
			
		}while(choice!=0);
		
		System.out.println("Exited Successfully!!!");
		
	}

}



