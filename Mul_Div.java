import java.util.Scanner;

class Test{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		double a, b, result;
		String cal;
		
		while(true){
			System.out.print("������ �������� �����մϴ�. ���� �Է��ϼ���: ");
			a = s.nextDouble();
			cal = s.next();
			b = s.nextDouble();
			
			if (cal.equals("*")==true||cal.equals("/")==true)
				break;
			
			else System.out.printf("[�Է� ����]������ �������� �����մϴ�.\n");
		}
		
		switch(cal){
			case "*": 
			result = a*b;
			if (result%1==0){
				System.out.println((int)result);
			}
			else System.out.printf("�����: %.2f",result);
			break;
			
			case "/":
			if(b==0){
				System.out.printf("0���δ� ���� �� �����ϴ�.");
				return;
			}
			result = a/b;
			if(result%1==0){
				System.out.println((int)result);
			}
			else System.out.printf("�����: %.2f",result);
			break;
		}
	}
}