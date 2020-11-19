import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double a;
		int p, abs, qou;
		String result;
		
		System.out.printf("-1000초과 1000 미만의 실수: ");
		a = s.nextDouble();
		
		p = (int)a;
		
		System.out.printf("입력한 실수의 정수 부분: " + p);
		
		abs = (p&0x80000000)==0?p:-p;
		
		System.out.printf("\n정수 부분의 절댓값: " + abs);
		
		qou = abs / 100;
		result = qou>1?qou+"백 ":(qou==1?"백 ":"");
		abs %= 100;
		
		qou = abs / 10;
		result += qou>1?qou+"십 ":(qou==1?"십 ":"");
		abs %= 10;
		
		result += (abs==0?"":abs);
		
		System.out.printf("("+result+")");
		
	}
}