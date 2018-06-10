
public class n5Main5 {
	public static void main(String[] args) {
		int a=1, b;
		System.out.println(++a);//odrazu powiekszona o 1
		System.out.println(a++);//wyswietlona nastepnie powiekszona o 1
		System.out.println(a);// 1
		b=a++;//2 
		System.out.println(b);//(1) 2
		b=++a;
		System.out.println(++a);//(2)
	}

}
