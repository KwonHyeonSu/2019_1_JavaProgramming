import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("정수1: ");
		a = s.nextInt();
		
		System.out.printf("정수2: ");
		b = s.nextInt();
		
		System.out.printf("|%15s|%15s|%15s|\n","a+b","a*b","a-b");
		System.out.printf("|%+15d|%#-15o|%#15x|",a+b,a*b,a-b);
		
	}
}