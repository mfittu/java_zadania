
public class Main13 {

    public static void main(String[] args) {

		int points = 99;
	if ( points <= 0) {
		System.out.println("Ilość punktów mniejsza niż 0");
	}else if (points >= 100) {
		System.out.println("Ilość punktów wieksza niż 100");
	}else if ( points <= 39) {
		System.out.println("wynik: ocena niedostateczna");
	}else if (points <= 54) {
		System.out.println("wynik: ocena dopuszczajaca");
	}else if ( points <=69 ) {
		System.out.println("wynik: ocena dostateczna");
	}else if ( points <= 84 && points >=70) {
		System.out.println("wynik: ocena dobra");
	}else if (points <= 98 &&  points >=85) {
		System.out.println("wynik: ocena bardzo dobra");
	}else if( points <= 100) {
		System.out.println("wynik: ocena celujaca");
	}
}
}