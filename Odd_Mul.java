import java.util.Scanner;

class Test5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int n,round=0,mul=1;
		
		while(true){
			System.out.printf("���� : ");
			n = s.nextInt();
			if(n==-1)
				break;
			if(n>0 && n%2==1){
				round ++;
				mul*=n;
			}
		}
		if(round==0){
			System.out.printf("������ �����ϴ� ������ �����ϴ�.");
		}
		else{
			System.out.printf("�Է��� �� �� ������ �����ϴ� %d���� ���� Ȧ������ ���� %d�Դϴ�.",round,mul);
		}
	}
}