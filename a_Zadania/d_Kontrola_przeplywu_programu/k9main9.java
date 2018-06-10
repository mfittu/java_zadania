
public class k9main9 {
	
	 int n = 5;
	 for (int i = 0; i < n; i++) {
		 String row = "";
		
		 for (int i =1; i <= n; i++) {	 
		String numbers = "";
		 for(int j = 0; j<n; j++) {
			 if (i >=j && i < n) {
				 row+= "*";
			 }
		for (int j = i; j <= n; j++ ) {
			if (i >= j) {
				numbers+="*";
			}
			else {
				j++;
				numbers+= j;
				j--;
				numbers +=j;
			}
		}
		 System.out.print(row + numbers +"\n");
		 System.out.print(numbers + "\n");
		 }
		 }
		 }
	 }
}
	 	     

