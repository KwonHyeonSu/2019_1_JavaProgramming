import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double a;
		int p, abs, qou;
		String result;
		
		System.out.printf("-1000�ʰ� 1000 �̸��� �Ǽ�: ");
		a = s.nextDouble();
		
		p = (int)a;
		
		System.out.printf("�Է��� �Ǽ��� ���� �κ�: " + p);
		
		abs = (p&0x80000000)==0?p:-p;
		
		System.out.printf("\n���� �κ��� ����: " + abs);
		
		qou = abs / 100;
		result = qou>1?qou+"�� ":(qou==1?"�� ":"");
		abs %= 100;
		
		qou = abs / 10;
		result += qou>1?qou+"�� ":(qou==1?"�� ":"");
		abs %= 10;
		
		result += (abs==0?"":abs);
		
		System.out.printf("("+result+")");
		
	}
}