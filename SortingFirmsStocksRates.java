package gradedassessments2;

public class SortingFirmsStocksRates{
	
	public void ascendingOrderMergeSort(double rates[],int left,int right){
		
		if(left<right){
			
			int mid=(left+right)/2;
			ascendingOrderMergeSort(rates,left,mid);
			ascendingOrderMergeSort(rates,mid+1,right);
			ascendingOrderMergeSorting(rates,left,mid,right);
			
		}
		
	}
	
	public void ascendingOrderMergeSorting(double rates[],int left,int mid,int right){
		
		int a=left,b=left,c=mid+1;
		double auxillary_array[] = new double[right+1];
		
		while(a<=mid && c<=right){
			
			if(rates[a]>rates[c]){
				
				auxillary_array[b]=rates[c];
				b++;
				c++;
				
			}
			
			else{
				
				auxillary_array[b]=rates[a];
				b++;
				a++;
				
			}
			
		}
		
		while(a<=mid){
			
			auxillary_array[b]=rates[a];
			b++;
			a++;
			
		}
		
		while(c<=right){
			
			auxillary_array[b]=rates[c];
			b++;
			c++;
			
		}
		
		for(int i=left;i<=right;i++)
			rates[i]=auxillary_array[i];
			
	}
	
	public void descendingOrderMergeSort(double rates[],int left,int right){
		
		if(left<right){
			
			int mid=(left+right)/2;
			descendingOrderMergeSort(rates,left,mid);
			descendingOrderMergeSort(rates,mid+1,right);
			descendingOrderMergeSorting(rates,left,mid,right);
			
		}
		
	}
	
	public void descendingOrderMergeSorting(double rates[],int left,int mid,int right){
		
		int a=left,b=left,c=mid+1;
		double auxillary_array[] = new double[right+1];
		
		while(a<=mid && c<=right){
			
			if(rates[a]>rates[c]){
				
				auxillary_array[b]=rates[a];
				b++;
				a++;
				
			}
			
			else{
				
				auxillary_array[b]=rates[c];
				b++;
				c++;
				
			}
			
		}
		
		while(a<=mid){
			
			auxillary_array[b]=rates[a];
			b++;
			a++;
			
		}
		
		while(c<=right){
			
			auxillary_array[b]=rates[c];
			b++;
			c++;
			
		}
		
		for(int i=left;i<=right;i++)
			rates[i]=auxillary_array[i];
		
	}
	
}

