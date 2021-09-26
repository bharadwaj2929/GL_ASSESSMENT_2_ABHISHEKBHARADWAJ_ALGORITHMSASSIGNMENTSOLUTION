package gradedassessments2;

public class StocksRatesComparisons{
	
	public void ratesIncrease(boolean firms_shares_rates[]){
		
		int a=0;
		
		for(int i=0;i<firms_shares_rates.length;i++){
			
			if(firms_shares_rates[i]==true)
				a+=1;
		
		}
		
		System.out.println("Total Number Of Firms Whose Stocks Rates Increased Today:" + a);
		
	}
	
	public void ratesDecrease(boolean firms_shares_rates[]){
		
		int b=0;
		
		for(int i=0;i<firms_shares_rates.length;i++){
			
			if(firms_shares_rates[i]==false)
				b+=1;
			
		}
		
		System.out.println("Total Number Of Firms Whose Stocks Rates Decreased Today:" + b);
		
	}
	
}

