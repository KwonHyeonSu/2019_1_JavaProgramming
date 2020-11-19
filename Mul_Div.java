import java.util.Scanner;

class Test{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		double a, b, result;
		String cal;
		
		while(true){
			System.out.print("곱셈과 나눗셈만 가능합니다. 식을 입력하세요: ");
			a = s.nextDouble();
			cal = s.next();
			b = s.nextDouble();
			
			if (cal.equals("*")==true||cal.equals("/")==true)
				break;
			
			else System.out.printf("[입력 오류]곱셈과 나눗셈만 가능합니다.\n");
		}
		
		switch(cal){
			case "*": 
			result = a*b;
			if (result%1==0){
				System.out.println((int)result);
			}
			else System.out.printf("계산결과: %.2f",result);
			break;
			
			case "/":
			if(b==0){
				System.out.printf("0으로는 나눌 수 없습니다.");
				return;
			}
			result = a/b;
			if(result%1==0){
				System.out.println((int)result);
			}
			else System.out.printf("계산결과: %.2f",result);
			break;
		}
	}
}