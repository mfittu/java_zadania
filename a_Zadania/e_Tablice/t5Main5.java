
public class t5Main5 {

	public static void main(String[] args) {
		int [] numbers= {328,66,14,-93,25,-7,3,15,63,-666};
		int max = 0;
		for(int i = 0; i< numbers.length; i++) {
			
		if(numbers[i] > max) {
			max = numbers[i];
		System.out.println("Najwieksza liczba to: " + max);
			
		}
		}

}
}