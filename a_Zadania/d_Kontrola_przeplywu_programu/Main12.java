
public class Main12 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4; 
		int c = 7;
		
		if ((a + b > c & b + c > a) && c + a  > b) {
				System.out.println("Z podanych boków można zbudować trójkąt.");
		}else {
			System.out.println("Z podanych boków nie można zbudować trójkąt.");
		}
	}

}
