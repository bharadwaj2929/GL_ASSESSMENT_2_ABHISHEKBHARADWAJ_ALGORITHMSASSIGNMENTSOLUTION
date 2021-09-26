package gradedassessments2;

import java.util.Scanner;

public class SearchSpecificStocksRates{
	
	public void searchSpecificStocksRates(double rates[]){
		
		Scanner scanner = new Scanner(System.in);
		
		SortingFirmsStocksRates sfsr = new SortingFirmsStocksRates();
		sfsr.ascendingOrderMergeSort(rates,0,rates.length-1);
		System.out.println("Search Specific Stocks_Rates By Entering Item Value:");
		
		double item = scanner.nextDouble();
		int left=0,right=rates.length-1,mid=(left+right)/2;
		
		while(left<=right){
			
			if(item<rates[mid])
				right=mid-1;
			
			else if(item==rates[mid]){
				
				System.out.println("Stock Of Value " + item + " Is Present!!!");
				break;
				
			}
			
			else{
				
				left=mid+1;
				
			}
			
			mid=(left+right)/2;
			
		}
		
		if(left>right)
			System.out.println("Stock Of Value " + item + " Is Absent!!!");
		
	}
	
}



