
public class t4Main4 {
	public static void main(String[] args) {
		  int[] numbers = {5,6,3,9,7,2,1,10,18,11};
	        int sum = 0;
	        for(int i = 0; i < 10; i++){
	            if(i % 2 == 0)
	            System.out.println(i);
	            sum += numbers[i];
	            }
	            System.out.println("suma liczb nieparzystych to:" + sum);
	 
	    }
}