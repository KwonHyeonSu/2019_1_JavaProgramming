import java.util.Scanner;

class Test5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int n,round=0,mul=1;
		
		while(true){
			System.out.printf("정수 : ");
			n = s.nextInt();
			if(n==-1)
				break;
			if(n>0 && n%2==1){
				round ++;
				mul*=n;
			}
		}
		if(round==0){
			System.out.printf("조건을 만족하는 정수가 없습니다.");
		}
		else{
			System.out.printf("입력한 수 중 조건을 만족하는 %d개의 양의 홀수들의 곱은 %d입니다.",round,mul);
		}
	}
}