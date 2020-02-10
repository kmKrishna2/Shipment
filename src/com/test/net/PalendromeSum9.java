package com.test.net;

public class PalendromeSum9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5609;i<6609;i++) {
			int n=i;
			int r = 0;
			int sum =0;
			while(n>0) {
				r = r*10+(n%10);
				sum= sum+n%10 ;
				n=n/10;
			}
			
				if(sum>9) {
					int s=0;
					while (sum>0) {
						s= s+sum%10;
						sum=sum/10;
						if(sum==0 && s>9) {
							sum=s;
							s=0;
						}
					}
					if(s==9) {
						sum=9;
					}
				}
			if(sum==9 && r==i) {
				System.out.println("9 sum ========="+sum +" ::"+ i);
			}	
			
		}
	}

}
